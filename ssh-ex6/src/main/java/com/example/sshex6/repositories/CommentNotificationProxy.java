package com.example.sshex6.repositories;

import com.example.sshex6.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
