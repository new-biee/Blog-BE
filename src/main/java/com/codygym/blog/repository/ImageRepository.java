package com.codygym.blog.repository;

import com.codygym.blog.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.tools.JavaCompiler;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    Iterable<Image> findAllByPostId(Long id);
}
