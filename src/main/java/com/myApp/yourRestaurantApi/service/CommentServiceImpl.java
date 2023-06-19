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

    @Override
    public Comment deleteComment(long commentId) {
        Comment comment = commentRepository.findById(commentId)
                .orElseThrow(null);
        commentRepository.delete(comment);
        return comment;
    }

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

}
