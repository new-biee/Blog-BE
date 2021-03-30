package com.codygym.blog.service.inteface;



import com.codygym.blog.model.Post;

import java.util.Optional;

public interface PostService extends iService<Post> {
    void changStatusPostTrue(Long id);

    void changStatusPostFalse(Long id);

    Iterable<Post> findAll();

    Iterable<Post> findAllByStatus(int status);

    Iterable<Post> findAllByUserId(Long idUser);

    Iterable<Post> findAllByContent(String content, Long id);

    Optional<Post> findById(Long id);

    Iterable<Post> findAllByCategoryId(Long categoryId);

    Iterable<Post> findTop4New();
}
