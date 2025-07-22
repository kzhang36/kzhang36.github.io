package com.seismic.webgis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seismic.webgis.entity.EarthquakeEvent;
import com.seismic.webgis.mapper.EarthquakeEventMapper;
import com.seismic.webgis.service.EarthquakeEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EarthquakeEventServiceImpl implements EarthquakeEventService {

    @Autowired
    private EarthquakeEventMapper mapper;

    @Override
    public void saveOrUpdateEvents(List<EarthquakeEvent> events) {
        for (EarthquakeEvent event : events) {
            QueryWrapper<EarthquakeEvent> query = new QueryWrapper<>();
            query.eq("event_id", event.getEventId());

            if (mapper.selectCount(query) == 0) {
                mapper.insert(event);
            }
        }
    }
}
