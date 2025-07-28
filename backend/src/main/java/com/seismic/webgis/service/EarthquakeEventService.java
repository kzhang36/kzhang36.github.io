package com.example.seismicgis.service;
import com.example.seismicgis.entity.Earthquake;
 import com.example.seismicgis.repository.EarthquakeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EarthquakeService {
private final EarthquakeRepository repo;
public EarthquakeService(EarthquakeRepository repo) {
    this.repo = repo;
}
public List<Earthquake> getAll() {
return repo.findAll();
}
}
