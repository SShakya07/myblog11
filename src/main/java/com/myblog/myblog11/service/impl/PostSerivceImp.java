package com.myblog.myblog11.service.impl;

import com.myblog.myblog11.entity.post;
import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.repository.PostRepository;
import com.myblog.myblog11.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostSerivceImp implements PostService{

    private PostRepository postRepository;

    public PostSerivceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        post p = new post();
        p.setTitle(postDto.getTitle());
        p.setDescription(postDto.getDescription());
        p.setContent(postDto.getContent());

      post savePost =  postRepository.save(p);
      PostDto dto = new PostDto();
      dto.setTitle(savePost.getTitle());
      dto.setDescription(savePost.getDescription());;
      dto.setContent(savePost.getContent());
        return null;
    }
}
