package com.raweceek.raweceek_api.repositories;

import com.raweceek.raweceek_api.models.Drivers;
import com.raweceek.raweceek_api.models.RaceResults;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface RaceResultsRepository extends CrudRepository<RaceResults, Integer> {

    @Query(value = "SELECT * FROM raweceek.race_results  WHERE drivernumber=:id", nativeQuery = true)
    Iterable<RaceResults> findResultsByDriverNumber(@Param("id") String id);

}
