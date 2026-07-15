package com.divyansh.fullstacklabs.springSecurityApplication.services;

import com.divyansh.fullstacklabs.springSecurityApplication.dto.PostDto;

import java.util.List;

public interface PostService {

    List<PostDto> getAllPosts();
    PostDto createNewPost(PostDto inputPost);

    PostDto getPostById(Long postId);

    PostDto updatePost(PostDto inputPost, Long postId);
}
