package com.example.facebook_demo.Controller;

import com.example.facebook_demo.Service.ServiceProject;
import com.example.facebook_demo.model.Post;
import com.example.facebook_demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {
    @Autowired
    private ServiceProject serviceProject;
    //user
    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> user = serviceProject.getAllUsers();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    @PostMapping("/insetuser")
    public int InsertUser(@RequestBody User user){
        serviceProject.saveUser(user);
        return user.getUser_id();
    }
    //posts
    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getAllPosts(){
        List<Post> posts = serviceProject.getAllPosts();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }
}
