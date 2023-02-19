package com.example.sshex6.proxies;

import com.example.sshex6.model.Comment;
import com.example.sshex6.repositories.CommentRepository;

public class DBCommentRepository implements CommentRepository {


    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment : " + comment.getText());
    }
}
