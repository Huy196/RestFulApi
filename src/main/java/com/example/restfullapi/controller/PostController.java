package com.example.restfullapi.controller;

import com.example.restfullapi.model.Post;
import com.example.restfullapi.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.peer.ListPeer;
import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {
    @Autowired
    private IPostService iPostService;

    @GetMapping
    public ResponseEntity<List<Post>> findAll(){
        List<Post> posts = iPostService.findAll();

        if (posts.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(posts, HttpStatus.OK);
    }
    @GetMapping("category/{Category}")
    public ResponseEntity<List<Post>> findAllByCategory(@PathVariable("Category") int id){
        List<Post> posts = iPostService.findAllByCategory(id);

        if (posts.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @GetMapping("post/{Category}")
    public ResponseEntity<Post> findByPostId(@PathVariable("Category") int id){
        Post posts = iPostService.findById(id);

        if (posts == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

}
