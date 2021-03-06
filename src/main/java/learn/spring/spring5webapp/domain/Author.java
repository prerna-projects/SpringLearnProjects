package learn.spring.spring5webapp.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ìd;
	
	private String firstName;
	private String lastName;
	
	@ManyToMany(mappedBy = "authors")
	
	private Set<Book> Books = new HashSet<>();
	
	public Author() {
		
	}
	
	public Author(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
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

	public long getId() {
		return ìd;
	}

	public void setId(long id) {
		ìd = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ìd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return ìd == other.ìd;
	}

	@Override
	public String toString() {
		return "Author [BookId=" + ìd + ", firstName=" + firstName + ", lastName=" + lastName 
				+ "]";
	}
	
	
}
