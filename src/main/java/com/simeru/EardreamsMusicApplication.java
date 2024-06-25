package com.eardreams.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eardreams.project.service.BranoServiceImpl;
import com.eardreams.project.service.PlaylistServiceImpl;

@SpringBootApplication
public class EardreamsMusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(EardreamsMusicApplication.class, args);
	}

}
