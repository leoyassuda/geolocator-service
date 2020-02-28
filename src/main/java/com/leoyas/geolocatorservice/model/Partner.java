package com.leoyas.geolocatorservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "partners")
public class Partner {

    @Id
    private String id;

    private String tradingName;

    private String ownerName;

    @TextIndexed
    private String document;

    private CoverageArea coverageArea;

    private Address address;
}
