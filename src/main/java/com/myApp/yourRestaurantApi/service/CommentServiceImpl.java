package com.myApp.yourRestaurantApi.service;

import com.myApp.yourRestaurantApi.domain.Comment;
import com.myApp.yourRestaurantApi.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAllComments() {
        return commentRepository.findAll();
    }



}
