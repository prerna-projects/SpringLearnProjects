package learn.spring.spring5webapp.respositories;

import org.springframework.data.repository.CrudRepository;

import learn.spring.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
