package com.myblog.myblog11.controller;

import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {
  private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
 @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto dto = postService.createPost(postDto);
    return  new ResponseEntity<>(dto, HttpStatus.CREATED);


    }
    //http://localhost:8080/api/posts?id=1
    @GetMapping
   public ResponseEntity<PostDto> getPostById(long id){
       PostDto post = postService.getPostById(id);
       return new ResponseEntity<>(post,HttpStatus.OK);
   }


}
