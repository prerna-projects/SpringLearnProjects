package learn.spring.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import learn.spring.spring5webapp.respositories.AuthorRepository;

@Controller
public class AuthorController {

		private final AuthorRepository authorRepository;

		public AuthorController(AuthorRepository authorRepository) {
			super();
			this.authorRepository = authorRepository;
		}
		
		@RequestMapping("/authors")
		public String author(Model model) {
			
			model.addAttribute("authors",authorRepository.findAll());
			return "authors/list";
		}
}
