package com.seismic.webgis.controller;

import com.seismic.webgis.entity.EarthquakeEvent;
import com.seismic.webgis.service.EarthquakeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/earthquakes")
public class EarthquakeController {

    @Autowired
    private EarthquakeEventService eventService;

    @PostMapping
    public String upload(@RequestBody List<EarthquakeEvent> events) {
        eventService.saveOrUpdateEvents(events);
        return "OK";
    }

    @GetMapping
    public String hello() {
        return "Earthquake WebGIS backend is running.";
    }
}
