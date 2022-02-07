package br.uff.renan.resource_collection.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.uff.renan.resource_collection.models.Author;

@RepositoryRestResource(collectionResourceRel = "authors", path = "authors")
public interface AuthorRepository extends PagingAndSortingRepository<Author, Integer> {
  
  List<Author> findByLastName(@Param("lastName") String lastName);

}
