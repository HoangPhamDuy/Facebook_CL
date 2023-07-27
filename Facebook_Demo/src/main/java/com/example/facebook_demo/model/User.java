package com.example.facebook_demo.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "username", unique = true, nullable = false,length = 50)
    private String username;

    @Column(name = "email", unique = true, nullable = false,length = 100)
    private String email;

    @Column(name = "password", nullable = false,length = 255)
    private String password;

    @Column(name = "profile_picture" ,length = 255)
    private String profilePicture;

    @Column(name = "bio",columnDefinition = "text")
    private String bio;

    @Column(name = "created_at" , nullable = false,columnDefinition = "timestamp default current_timestamp")
    private Timestamp createdAt;

    @Column(name = "updated_at",columnDefinition = "timestamp null default null on update current_timestamp")
    private Timestamp updatedAt;


}
