package br.uff.renan.resource_collection.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.uff.renan.resource_collection.models.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Integer> {
  
}
