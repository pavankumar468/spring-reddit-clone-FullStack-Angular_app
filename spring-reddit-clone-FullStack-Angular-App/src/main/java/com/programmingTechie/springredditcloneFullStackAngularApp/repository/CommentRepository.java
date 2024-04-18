package com.programmingTechie.springredditcloneFullStackAngularApp.repository;

import com.programmingTechie.springredditcloneFullStackAngularApp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
