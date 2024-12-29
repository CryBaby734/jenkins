package org.example.blogcenter.service;

import lombok.RequiredArgsConstructor;
import org.example.blogcenter.Entity.Post;
import org.example.blogcenter.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }


}
