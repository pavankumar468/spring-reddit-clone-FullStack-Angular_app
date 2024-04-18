package com.programmingTechie.springredditcloneFullStackAngularApp.repository;

import com.programmingTechie.springredditcloneFullStackAngularApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
