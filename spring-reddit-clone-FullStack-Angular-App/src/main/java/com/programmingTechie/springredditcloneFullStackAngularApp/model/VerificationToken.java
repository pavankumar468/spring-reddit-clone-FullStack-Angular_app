package com.programmingTechie.springredditcloneFullStackAngularApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

//when user is registred we generate a token we store it in database using
// VerificationToken entity & send token as activation link to user
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="token")
public class VerificationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String token;
    @OneToOne(fetch = FetchType.LAZY)
    private User user;
    private Instant expiryDate;
}
