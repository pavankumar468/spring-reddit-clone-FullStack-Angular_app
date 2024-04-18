package com.programmingTechie.springredditcloneFullStackAngularApp.repository;

import com.programmingTechie.springredditcloneFullStackAngularApp.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
