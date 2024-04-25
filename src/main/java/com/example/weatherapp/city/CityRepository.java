package com.example.weatherapp.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT * FROM city WHERE lat = :latitude AND lon = :longitude LIMIT 1", nativeQuery = true)
    City findCityByCoordinates(@Param("latitude") Double latitude, @Param("longitude") Double longitude);


}
