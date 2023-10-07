package com.alammar.testcontainer.repo;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;

import com.alammar.testcontainer.model.Post;

public interface PostRepository extends ListCrudRepository<Post,Integer> {

    Optional<Post> findByTitle(String title);

}