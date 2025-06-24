package com.example.restfullapi.service;

import com.example.restfullapi.model.Post;

import java.util.List;

public interface IPostService extends IGeneralService<Post>{
    List<Post> findAllByCategory(int category);
}
