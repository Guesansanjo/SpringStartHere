package com.example.sshex6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan (  basePackages= {"com.example.sshex6.proxies","com.example.sshex6.services","com.example.sshex6.repositories"})
public class ProjectConfig {
}
