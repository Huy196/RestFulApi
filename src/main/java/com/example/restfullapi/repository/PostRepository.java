package com.example.restfullapi.repository;

import com.example.restfullapi.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    @Query("SELECT p FROM Post p WHERE p.category.category_id = ?1")
    List<Post> findPostsByCategoryId(int categoryId);

}
