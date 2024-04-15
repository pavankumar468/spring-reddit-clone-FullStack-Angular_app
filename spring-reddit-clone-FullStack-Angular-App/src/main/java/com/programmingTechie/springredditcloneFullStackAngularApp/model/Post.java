package com.programmingTechie.springredditcloneFullStackAngularApp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long post_id;
    @NotBlank(message = "postname should not be null or empty")
    private String postName;
    @Nullable
    private String url;
    @Nullable
    @Lob
    private String Description;
    private Integer voteCount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",referencedColumnName = "userId") //foreign key "user_id" of post table refers to referencecolumnname i.e primary key "id" of user table
    private User user;
    private Instant createdDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="subreddit_id",referencedColumnName = "id" ) //foregin key "subreddit_id" of post refers to refrencecolumnname ie primarykey "id" of subreddit table
    private Subreddit subreddit;

}
