package br.uff.renan.resource_collection.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.uff.renan.resource_collection.models.Resource;

public interface ResourceRepository extends PagingAndSortingRepository<Resource, Integer> {
  
}
