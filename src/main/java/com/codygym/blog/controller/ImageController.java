package com.codygym.blog.controller;


import com.codygym.blog.model.Image;
import com.codygym.blog.service.inteface.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/images")
public class ImageController {
    @Autowired
    ImageService imageService;

    @GetMapping
    public ResponseEntity<Iterable<Image>> getAll() {
        Iterable<Image> images = imageService.findAll();
        return new ResponseEntity<>(images, HttpStatus.OK);
    }

    @GetMapping("/{post-id}")
    public ResponseEntity<Iterable<Image>> getAll(@PathVariable(name = "post-id") Long postId) {
        Iterable<Image> images = imageService.findAllByPostId(postId);
        return new ResponseEntity<>(images, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Image> save(@RequestBody Image image) {
        imageService.save(image);
        return new ResponseEntity<>(image, HttpStatus.OK);
    }
}
