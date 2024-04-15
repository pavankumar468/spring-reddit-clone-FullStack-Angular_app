package com.programmingTechie.springredditcloneFullStackAngularApp.model;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Subreddit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "commnity name is required")
    private String name;

    @NotBlank(message = "Description is required")
    private String description;
    @OneToMany(mappedBy = "subreddit",cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private List<Post> posts;
    private Instant createdDate;
    @ManyToOne(fetch = FetchType.LAZY) // it loads user entity the associated subreddit is not loa ded
    private User user;
}
