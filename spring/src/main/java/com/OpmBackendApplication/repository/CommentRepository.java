package com.OpmBackendApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.OpmBackendApplication.model.Comment;
import com.OpmBackendApplication.model.Post;
import com.OpmBackendApplication.model.User;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
