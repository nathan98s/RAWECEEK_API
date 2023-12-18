package com.raweceek.raweceek_api.repositories;

import com.raweceek.raweceek_api.models.Drivers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface DriversRepository extends CrudRepository<Drivers, Integer> {

    @Query(value = "SELECT * FROM raweceek.drivers  WHERE team=:team", nativeQuery = true)
    Iterable<Drivers> findDriversByTeam(@Param("team") String team);

}
