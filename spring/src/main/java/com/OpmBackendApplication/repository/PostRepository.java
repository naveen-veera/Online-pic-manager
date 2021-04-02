package com.OpmBackendApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.OpmBackendApplication.model.Post;
import com.OpmBackendApplication.model.Subreddit;
import com.OpmBackendApplication.model.User;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
