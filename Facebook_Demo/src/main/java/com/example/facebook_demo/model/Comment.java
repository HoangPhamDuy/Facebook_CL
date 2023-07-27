package com.example.facebook_demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Integer comment_id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @Column(name = "comment")
    private String comment;

    @Column(name = "created_at" , nullable = false,columnDefinition = "timestamp default current_timestamp")
    private Timestamp createdAt;

    @Column(name = "updated_at",columnDefinition = "timestamp null default null on update current_timestamp")
    private Timestamp updatedAt;


}
