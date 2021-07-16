package learn.spring.spring5webapp.bootStrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import learn.spring.spring5webapp.domain.Author;
import learn.spring.spring5webapp.domain.Book;
import learn.spring.spring5webapp.domain.Publisher;
import learn.spring.spring5webapp.respositories.AuthorRepository;
import learn.spring.spring5webapp.respositories.BookRepository;
import learn.spring.spring5webapp.respositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		
		Author john = new Author("John", "Green");
		Book fios = new Book("Fault in our stars","12312");
		
		Publisher classmate = new Publisher("Classmate","760, Anna Salal", "Chennai", "T.N.", "600 002");
		
		// First object
		john.getBooks().add(fios);
		fios.getAuthors().add(john);
		
		
		authorRepository.save(john);
		bookRepository.save(fios);
		// check this
		fios.setPublisher(classmate);
		classmate.getBooks().add(fios);
				
		publisherRepository.save(classmate);
		
		//Second object
		Author paulo = new Author("Paulo","Colheo");
		Book alchemist = new Book("The Alchemist", "12313");
		
		paulo.getBooks().add(alchemist);
		alchemist.getAuthors().add(paulo);
		
		alchemist.setPublisher(classmate);
		classmate.getBooks().add(alchemist);
		
		authorRepository.save(paulo);
		bookRepository.save(alchemist);
		publisherRepository.save(classmate);
		
		System.out.println("Staring first app");
		System.out.println("NO. of Books: "+ bookRepository.count()+ " No. of Publisher: "+ publisherRepository.count());
		System.out.println("Publisher has books: "+ classmate.getBooks().size());
	}

}
