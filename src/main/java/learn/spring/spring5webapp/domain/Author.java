package learn.spring.spring5webapp.domain;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long BookId;
	
	private String firstName;
	private String lastName;
	
	@ManyToMany(mappedBy = "authors")
	
	private Set<Book> Books;
	
	public Author() {
		
	}
	
	public Author(String firstName, String lastName, Set<Book> books) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Books = books;
	}
	
	public Set<Book> getBooks() {
		return Books;
	}
	public void setBooks(Set<Book> books) {
		Books = books;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getBookId() {
		return BookId;
	}

	public void setBookId(long bookId) {
		BookId = bookId;
	}
}
