package learn.spring.spring5webapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String title;
	private String isbn;
	
	@ManyToMany
	@JoinTable( name="author_book" , joinColumns = @JoinColumn(name = "Book_Id"), 
	            inverseJoinColumns = @JoinColumn(name = "Author_Id"))
	private Set<Author>authors;
	
	public Book() {}
	
	public Book(String title, String isbn, Set<learn.spring.spring5webapp.domain.Author> author) {
		super();
		this.title = title;
		this.isbn = isbn;
		authors = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
	
	
	
	
}
