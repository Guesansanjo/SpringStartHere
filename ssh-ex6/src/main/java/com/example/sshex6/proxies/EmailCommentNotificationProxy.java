package com.example.sshex6.proxies;

import com.example.sshex6.model.Comment;
import com.example.sshex6.repositories.CommentNotificationProxy;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment : "+ comment.getText());
    }
}
