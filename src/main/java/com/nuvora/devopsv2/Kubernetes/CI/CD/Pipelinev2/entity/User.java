package com.nuvora.devopsv2.Kubernetes.CI.CD.Pipelinev2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    // Getters and Setters
}