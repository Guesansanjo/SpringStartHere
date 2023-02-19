package com.example.sshex6;

import com.example.sshex6.model.Comment;
import com.example.sshex6.proxies.DBCommentRepository;
import com.example.sshex6.proxies.EmailCommentNotificationProxy;
import com.example.sshex6.services.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SshEx6Application {

	public static void main(String[] args) {
/*
		var commentRepository =
				new DBCommentRepository();

		var commentNotificationProxy =
				new EmailCommentNotificationProxy();

		//Create instances for dependencies and post service

		var commentService =
				new CommentService(commentRepository,commentNotificationProxy);

				var comment = new Comment();
		comment.setAuthor("Bro");
		comment.setText("XDXDXD");
		commentService.publishComment(comment);

		 */

		var context =
				new AnnotationConfigApplicationContext(ProjectConfig.class);
			var comment = new Comment();
			comment.setAuthor("Holi");
			comment.setText("XdTest");
			var commentService = context.getBean(CommentService.class);
			commentService.publishComment(comment);
	}

}
