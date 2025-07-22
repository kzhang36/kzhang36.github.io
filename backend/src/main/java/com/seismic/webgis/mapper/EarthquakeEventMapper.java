package com.seismic.webgis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seismic.webgis.entity.EarthquakeEvent;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EarthquakeEventMapper extends BaseMapper<EarthquakeEvent> {
}
