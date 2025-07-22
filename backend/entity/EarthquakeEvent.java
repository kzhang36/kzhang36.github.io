package com.seismic.webgis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("earthquake_event")
public class EarthquakeEvent {

    @TableId
    private Long id;

    private String eventId;
    private String location;
    private Double latitude;
    private Double longitude;
    private Double depth;
    private Double magnitude;
    private LocalDateTime eventTime;
    private String geom; // WKT format (for insertion, e.g. "POINT(120.2 30.1)")
}
