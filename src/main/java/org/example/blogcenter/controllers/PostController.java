package org.example.blogcenter.controllers;


import lombok.RequiredArgsConstructor;
import org.example.blogcenter.Entity.Post;
import org.example.blogcenter.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> list() {
       return postService.getAllPosts();
    }
    @GetMapping("/{id}")
    public Post getPostbyId(@PathVariable long id) {
        return postService.getPostById(id);
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }
    @DeleteMapping
    public void deletePost(@PathVariable long id) {
        postService.deletePostById(id);
    }
}
