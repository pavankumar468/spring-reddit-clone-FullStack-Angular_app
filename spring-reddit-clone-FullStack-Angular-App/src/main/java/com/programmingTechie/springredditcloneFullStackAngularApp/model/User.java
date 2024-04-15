package com.programmingTechie.springredditcloneFullStackAngularApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotBlank(message="username is required")
    private String username;
    @NotBlank(message="password is required")
    private String password;
    @Email
    @NotEmpty(message = "email is required")
    private String email;
    private Instant createdDate;
    private boolean enabled; // user is enabled after completing email verification process
    //@OneToMany(mappedBy = "user",cascade = CascadeType.ALL) //mappedby=user  refers User owns relationship & "user" field of owing relationship
    //private List<Post> post;
}
