package com.example.seismicgis.repository;
import com.example.seismicgis.entity.Earthquake;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EarthquakeRepository extends JpaRepository<Earthquake, Long> {}
