package org.example.blogcenter.repository;

import org.example.blogcenter.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAll();


    Post save(Post post);
}
