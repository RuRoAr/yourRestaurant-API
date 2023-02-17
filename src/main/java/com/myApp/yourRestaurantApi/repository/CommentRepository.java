package com.myApp.yourRestaurantApi.repository;

import com.myApp.yourRestaurantApi.domain.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CommentRepository extends CrudRepository<Comment, Long> {

    List<Comment> findAll();



}
