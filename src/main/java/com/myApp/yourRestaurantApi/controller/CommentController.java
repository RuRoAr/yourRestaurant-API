package com.myApp.yourRestaurantApi.controller;

import com.myApp.yourRestaurantApi.domain.Comment;
import com.myApp.yourRestaurantApi.domain.User;
import com.myApp.yourRestaurantApi.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    private final Logger logger = LoggerFactory.getLogger(CommentController.class);

    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public List<Comment> getComments() {
        logger.info("Prepare a list for all comment");
        List<Comment> comments;
        logger.info("Find all restaurants");
        comments = commentService.findAllComments();
        logger.info("End find all comments");
        return comments;

    }

    @DeleteMapping("/comment/{commentId}")
    public Comment deleteComment(@PathVariable long commentId) {
        logger.info("Delete message with ID: " + commentId);
        Comment comment = commentService.deleteComment(commentId);
        logger.info("End delete comment with ID: " + commentId);
        return comment;
    }
    @PostMapping("/comment")
    public Comment addComment(@RequestBody Comment comment) {
        logger.info("Register a new comment", comment);
        Comment newComment = commentService.addComment(comment);
        logger.info("End register a new comment", comment);
        return newComment;
    }
}
