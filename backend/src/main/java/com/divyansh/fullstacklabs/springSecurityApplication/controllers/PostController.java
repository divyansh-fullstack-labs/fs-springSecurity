package com.divyansh.fullstacklabs.springSecurityApplication.controllers;

import com.divyansh.fullstacklabs.springSecurityApplication.dto.PostDto;
import com.divyansh.fullstacklabs.springSecurityApplication.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    @GetMapping
    public List<PostDto> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public PostDto createNewPost(@RequestBody PostDto inputPost) {
        return postService.createNewPost(inputPost);
    }

    @GetMapping("/{postId}")
    public PostDto getPostById(@PathVariable("postId") Long postId) {
        return postService.getPostById(postId);
    }

    @PutMapping("{postId}")
    public PostDto updatePost(@RequestBody PostDto inputPost, @PathVariable("postId") Long postId) {
        return postService.updatePost(inputPost,postId);
    }
}
