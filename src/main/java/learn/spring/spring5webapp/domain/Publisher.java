package learn.spring.spring5webapp.domain;

import java.util.*;
import javax.persistence.*;

@Entity
public class Publisher {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String name;
	private String address1;
	private String city;
	private String state;
	private String zip;
	
	@OneToMany
	@JoinColumn(name="publisher_Id")
    private Set<Book> Books = new HashSet<>();

	public Set<Book> getBooks() {
		return Books;
	}

	public void setBooks(Set<Book> books) {
		Books = books;
	} 
	public Publisher() {
		
	}
	
	public Publisher(String name, String address1, String city, String state, String zip) {
		this.name = name;
		this.address1 = address1;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address1, city, name, id, state, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return Objects.equals(address1, other.address1) && Objects.equals(city, other.city)
				&& Objects.equals(name, other.name) && id == other.id
				&& Objects.equals(state, other.state) && zip == other.zip;
	}

	@Override
	public String toString() {
		return "Publisher [publisherId=" + id + ", name=" + name + ", address1=" + address1 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	

	
}
