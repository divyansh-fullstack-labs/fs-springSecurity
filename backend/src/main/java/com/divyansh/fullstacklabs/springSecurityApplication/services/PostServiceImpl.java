package com.divyansh.fullstacklabs.springSecurityApplication.services;

import com.divyansh.fullstacklabs.springSecurityApplication.dto.PostDto;
import com.divyansh.fullstacklabs.springSecurityApplication.entities.PostEntity;
import com.divyansh.fullstacklabs.springSecurityApplication.exceptions.ResourceNotFoundException;
import com.divyansh.fullstacklabs.springSecurityApplication.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<PostDto> getAllPosts() {
        return postRepository
                .findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity,PostDto.class))
                .toList();
    }

    @Override
    public PostDto createNewPost(PostDto inputPost) {
        PostEntity postEntity = modelMapper.map(inputPost,PostEntity.class);
        return modelMapper.map(postRepository.save(postEntity),PostDto.class);
    }

    @Override
    public PostDto getPostById(Long postId) {
        PostEntity postEntity = postRepository
                .findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("Post with id " + postId + " not found"));
        return modelMapper.map(postEntity,PostDto.class);
    }

    @Override
    public PostDto updatePost(PostDto inputPost, Long postId) {
        PostEntity olderPost = postRepository.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post with id " + postId + " not found"));
        inputPost.setPostId(postId);
        modelMapper.map(inputPost,olderPost);
        PostEntity newPostEntity = postRepository.save(olderPost);
        return modelMapper.map(newPostEntity,PostDto.class);
    }
}
