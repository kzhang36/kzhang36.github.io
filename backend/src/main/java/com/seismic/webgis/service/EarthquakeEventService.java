package com.seismic.webgis.service;

import com.seismic.webgis.entity.EarthquakeEvent;

import java.util.List;

public interface EarthquakeEventService {
    void saveOrUpdateEvents(List<EarthquakeEvent> events);
}
