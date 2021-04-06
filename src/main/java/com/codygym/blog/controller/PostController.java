package com.codygym.blog.controller;

import com.codygym.blog.model.Post;
import com.codygym.blog.service.inteface.PostService;
import com.codygym.blog.service.inteface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<Iterable<Post>> getAll() {
        Iterable<Post> posts = postService.findAll();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Post> save(@RequestBody Post post) {
        Date date = new Date(Calendar.getInstance().getTime().getTime());
        post.setCreateAt(date);
        post.setStatus(1);
        post.setLikes((long) 0);
        postService.save(post);
        return new ResponseEntity(post, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> get(@PathVariable Long id) {
        Optional<Post> post = postService.findById(id);
        if (post.isPresent()){
            Post postCurrent = post.get();
            return new ResponseEntity(postCurrent, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
