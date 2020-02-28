package com.leoyas.geolocatorservice.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;

@Data
public class Address {

    private final static String type = "Point";

    /**
     * order should be <longitude,latitude>
     */
    @GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2D)
    double[] locationCoord;
}
