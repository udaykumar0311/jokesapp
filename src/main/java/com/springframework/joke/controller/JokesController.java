package com.springframework.joke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.joke.services.JokesService;

@RestController
public class JokesController {

	private JokesService jokesService;

	@Autowired
	public JokesController(JokesService jokesService) {
		this.jokesService = jokesService;
	}
	
	@RequestMapping("/")
	public String getJoke() {
		return jokesService.getJoke();
	}

}
