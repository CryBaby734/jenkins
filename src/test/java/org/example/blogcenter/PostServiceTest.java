package org.example.blogcenter;

import org.example.blogcenter.Entity.Post;
import org.example.blogcenter.repository.PostRepository;
import org.example.blogcenter.service.PostService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PostServiceTest {

    @InjectMocks
    private PostService postService;

    @Mock
    private PostRepository postRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllPosts() {
        // Создаем посты
        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setContent("Content 1");

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setContent("Content 2");


        when(postRepository.findAll()).thenReturn(Arrays.asList(post1, post2));


        List<Post> posts = postService.getAllPosts();


        assertEquals(2, posts.size());
        assertEquals("Post 1", posts.get(0).getTitle());
        assertEquals("Post 2", posts.get(1).getTitle());
    }

}
