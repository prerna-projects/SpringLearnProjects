package learn.spring.spring5webapp.respositories;

import org.springframework.data.repository.CrudRepository;

import learn.spring.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
