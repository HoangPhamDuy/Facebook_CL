package com.example.facebook_demo.Service;
import com.example.facebook_demo.Repository.PostRepository;
import com.example.facebook_demo.Repository.UserRepository;
import com.example.facebook_demo.model.Post;
import com.example.facebook_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceProject {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    //user
    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
    public void saveUser(User user) {
         userRepository.save(user);
    }
    //post
    public List<Post> getAllPosts()
    {
        return postRepository.findAll();
    }
}
