package guru.springframework.springjokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.springjokesapp.services.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	@RequestMapping({ "/", "" })
	public String showJOkes(Model model) {

		model.addAttribute("joke", jokeService.getJoke());
		return "index";

	}
}
