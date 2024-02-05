package com.myblog.myblog11.service.impl;

import com.myblog.myblog11.entity.post;
import com.myblog.myblog11.exception.ResourceNotFoundException;
import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.repository.PostRepository;
import com.myblog.myblog11.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostSerivceImp implements PostService{

    private PostRepository postRepository;

    private ModelMapper modelMapper;

    public PostSerivceImp(PostRepository postRepository,ModelMapper modelMapper) {

        this.postRepository = postRepository;
        this.modelMapper= modelMapper;
    }


    @Override
    public PostDto createPost(PostDto postDto) {
//        post p = new post();
//        p.setTitle(postDto.getTitle());
//        p.setDescription(postDto.getDescription());
//        p.setContent(postDto.getContent());
        post post = mapToEntity(postDto);

        post savePost =  postRepository.save(post);
//      PostDto dto = new PostDto();
//      dto.setTitle(savePost.getTitle());
//      dto.setDescription(savePost.getDescription());;
//      dto.setContent(savePost.getContent());
        PostDto dto = mapToDto(savePost);


        return dto;
    }

    @Override
    public PostDto getPostById(long id) {

        post savePost = postRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("post not found by id: " + id)
        );


        PostDto dto = new PostDto();
        dto.setId(savePost.getId());
        dto.setTitle(savePost.getTitle());
        dto.setDescription(savePost.getDescription());;
        dto.setContent(savePost.getContent());

        return dto;
    }

    @Override
    public List<PostDto> getAllPost(int pageNo, int pageSize, String sortBy, String sortDir) {
      Sort sort=  (sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()))?Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
      //  Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

        Page<post> pagePost = postRepository.findAll(pageable);
        List<post> posts = pagePost.getContent();

        List<PostDto> dtos = posts.stream().map(p -> mapToDto(p)).collect(Collectors.toList());
        return dtos;
    }

   PostDto mapToDto(post savePost){
       PostDto dto = modelMapper.map(savePost, PostDto.class);
//
//       PostDto dto = new PostDto();
//       dto.setId(savePost.getId());
//       dto.setTitle(savePost.getTitle());
//       dto.setDescription(savePost.getDescription());;
//       dto.setContent(savePost.getContent());
        return dto;
    }

   post mapToEntity(PostDto postDto){
       post post = modelMapper.map(postDto, post.class);
//        post post = new post();
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());

        return post;
    }



}
