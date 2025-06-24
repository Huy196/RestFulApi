package com.example.restfullapi.service;

import com.example.restfullapi.model.Category;
import com.example.restfullapi.model.Post;
import com.example.restfullapi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public List<Post> findAllByCategory(int category) {
        return postRepository.findPostsByCategoryId(category);
    }

    @Override
    public Post findById(int id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
