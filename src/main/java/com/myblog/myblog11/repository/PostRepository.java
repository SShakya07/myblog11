package com.myblog.myblog11.repository;

import com.myblog.myblog11.entity.post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<post,Long> {
}
