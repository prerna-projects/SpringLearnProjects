package learn.spring.spring5webapp.respositories;

import org.springframework.data.repository.CrudRepository;

import learn.spring.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
