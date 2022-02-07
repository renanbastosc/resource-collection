package br.uff.renan.resource_collection.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.uff.renan.resource_collection.models.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Integer> {

  @Query("SELECT e FROM events e WHERE e.startAt > ?1 and e.endAt < ?2")
  List<Event> findEventsFromPeriod(String startAt, String endAt);

}
