package com.example.facebook_demo.utills;

import com.example.facebook_demo.Repository.*;
import com.example.facebook_demo.model.*;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.sql.Timestamp;
import java.util.List;


@Configuration
public class UserFaker implements CommandLineRunner {
    private final Faker faker ;
    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final MessageRepository messageRepository;
    private final LikeRepository likeRepository;
    private final FriendRepository friendRepository;
    private final CommentRepository commentRepository;
    @Autowired
    public UserFaker(UserRepository userRepository, PostRepository postRepository, MessageRepository messageRepository, LikeRepository likeRepository, FriendRepository friendRepository, CommentRepository commentRepository){
        this.userRepository = userRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.messageRepository = messageRepository;
        this.likeRepository = likeRepository;
        this.friendRepository = friendRepository;
        this.faker = new Faker();
    }
    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername(faker.name().username());
            user.setEmail(faker.internet().emailAddress());
            user.setPassword(faker.internet().password());
            user.setProfilePicture(faker.internet().image());
            user.setBio(faker.lorem().paragraph());
            user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            user.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            userRepository.save(user);
        }
        // Tạo bài đăng
        List<User> users = userRepository.findAll();
        for (User user : users) {
            for (int i = 0; i < 10; i++) {
                Post post = new Post();
                post.setUser(user);
                post.setContent(faker.lorem().paragraph());
                post.setPostImage(faker.internet().image());
                post.setCreatedAt(new Timestamp(System.currentTimeMillis()));
                post.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
                postRepository.save(post);
            }
        }
        // Tạo tin nhắn giả
        for (int i = 0; i < 10; i++) {
            Message message = new Message();
            message.setSender(users.get(faker.number().numberBetween(0, users.size())));
            message.setReceiver(users.get(faker.number().numberBetween(0, users.size())));
            message.setMessage(faker.lorem().paragraph());
            message.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            message.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            messageRepository.save(message);
        }
        // Tạo like giả
        List<Post> posts = postRepository.findAll();
        for (Post post : posts) {
            for (int i = 0; i < 3; i++) {
                Like like = new Like();
                like.setUser(users.get(faker.number().numberBetween(0, users.size())));
                like.setPost(post);
                like.setCreatedAt(new Timestamp(System.currentTimeMillis()));
                likeRepository.save(like);
            }
        }
        // Tạo bạn bè giả
        for (int i = 0; i < 10; i++) {
            User user1 = users.get(faker.number().numberBetween(0, users.size()));
            User user2 = users.get(faker.number().numberBetween(0, users.size()));
            if (user1 == user2) {
                continue;
            }
            Friend friend1 = new Friend();
            friend1.setUser1(user1);
            friend1.setUser2(user2);
            friend1.setStatus(FriendStatus.ACCEPTED);
            friend1.setActionUser(user1);
            friend1.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            friend1.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            friendRepository.save(friend1);

            Friend friend2 = new Friend();
            friend2.setUser1(user2);
            friend2.setUser2(user1);
            friend2.setStatus(FriendStatus.ACCEPTED);
            friend2.setActionUser(user1);
            friend2.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            friend2.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            friendRepository.save(friend2);
        }

        // Tạo comment giả
        for (int i = 0; i < 10; i++) {
            User user = users.get(faker.number().numberBetween(0, users.size()));
            Post post = posts.get(faker.number().numberBetween(0, posts.size()));
            Comment comment = new Comment();
            comment.setUser(user);
            comment.setPost(post);
            comment.setComment(faker.lorem().sentence());
            comment.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            comment.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            commentRepository.save(comment);
        }
    }
}
