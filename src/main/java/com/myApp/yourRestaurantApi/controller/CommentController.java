package com.myApp.yourRestaurantApi.controller;

import com.myApp.yourRestaurantApi.domain.Comment;
import com.myApp.yourRestaurantApi.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
