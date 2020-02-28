package com.leoyas.geolocatorservice.model;

import lombok.Data;

import java.util.List;

@Data
public class CoverageArea {

    private String type = "MultiPolygon";

    private List<Coordinates> coordinates;

}
