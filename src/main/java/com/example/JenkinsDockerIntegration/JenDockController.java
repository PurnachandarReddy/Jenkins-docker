package com.example.JenkinsDockerIntegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenDockController {
	@GetMapping("/show")
	public String showData() {
		return "This application is running from Jenkins, First pushed to github and then Jenkins converted this as Image and pushed that to dockerhub..";
	}

}
