package learn.spring.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import learn.spring.spring5webapp.respositories.BookRepository;

@Controller
public class BookController {

	private final BookRepository bookRespository;
	
	public BookController(BookRepository bookRespository) {
		super();
		this.bookRespository = bookRespository;
	}

	@RequestMapping("/books")
	public String getBooks(Model model) {
		
		model.addAttribute("books", bookRespository.findAll());
		return "books/list";
	}
}
