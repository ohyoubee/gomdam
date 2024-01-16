package com.example.gomdam.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;

    @Column(nullable = false)
    private String userId;

    @Column(nullable = false)
    String password;
}
