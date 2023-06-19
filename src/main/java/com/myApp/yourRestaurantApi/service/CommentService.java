package com.myApp.yourRestaurantApi.service;

import com.myApp.yourRestaurantApi.domain.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAllComments();
    Comment deleteComment(long id);
    Comment addComment(Comment comment);
}
