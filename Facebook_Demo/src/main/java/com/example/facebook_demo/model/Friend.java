package com.example.facebook_demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Friends")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friend_id")
    private Integer friend_id;

    @ManyToOne
    @JoinColumn(name = "user_id1", nullable = false)
    private User user1;

    @ManyToOne
    @JoinColumn(name = "user_id2", nullable = false)
    private User user2;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private FriendStatus status;

    @ManyToOne
    @JoinColumn(name = "action_user_id", nullable = false)
    private User actionUser;

    @Column(name = "created_at" , nullable = false,columnDefinition = "timestamp default current_timestamp")
    private Timestamp createdAt;

    @Column(name = "updated_at",columnDefinition = "timestamp null default null on update current_timestamp")
    private Timestamp updatedAt;

}
