package com.tnt.sample.kube.samplekube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@SpringBootApplication
@Controller
public class SampleKubeApplication {

	@RequestMapping("/api/v1/greetings")
	@GetMapping
	public ResponseEntity<String> getGreetings() {
		return ResponseEntity.ok("Hello user, current time is: " + LocalDateTime.now());

	}

	public static void main(String[] args) {
		SpringApplication.run(SampleKubeApplication.class, args);
	}

}
