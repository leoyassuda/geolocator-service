package com.leoyas.geolocatorservice.model;

import javafx.util.Pair;
import lombok.Data;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;

import java.util.List;

@Data
public class Coordinates {

    @GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
    private List<Pair<Double, Double>> pointCoordinate;
}
