
package com.myblog.myblog11.service;

import com.myblog.myblog11.payload.PostDto;

import java.util.List;

public interface PostService {



//     PostDto getPostById(long id);

    PostDto createPost(PostDto postDto);
    PostDto getPostById(long id);

    List<PostDto> getAllPost();
}
