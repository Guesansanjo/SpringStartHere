package com.example.sshex6.services;

import com.example.sshex6.model.Comment;
import com.example.sshex6.repositories.CommentNotificationProxy;
import com.example.sshex6.repositories.CommentRepository;

public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);

    }
}
