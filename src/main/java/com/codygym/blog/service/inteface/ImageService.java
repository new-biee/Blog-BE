package com.codygym.blog.service.inteface;


import com.codygym.blog.model.Image;

public interface ImageService extends iService<Image> {
    Iterable<Image> findAllByPostId(Long id);
}
