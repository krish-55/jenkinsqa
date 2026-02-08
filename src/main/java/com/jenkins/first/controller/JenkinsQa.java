package com.jenkins.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsQa {
	
	@GetMapping("/")
    public String home() {
        return "welcome to jenkins qa branch";
    }
}
