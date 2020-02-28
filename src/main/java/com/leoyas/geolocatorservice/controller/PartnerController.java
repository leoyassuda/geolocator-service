package com.leoyas.geolocatorservice.controller;

import com.leoyas.geolocatorservice.model.Partner;
import com.leoyas.geolocatorservice.service.PartnerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Log4j2
@RestController
@RequestMapping("/partners")
public class PartnerController {

    @Autowired
    private PartnerService partnerService;

    @GetMapping("/{id}")
    public Mono<Partner> getPartnerById(@PathVariable String id) {
        return partnerService.findById(id);
    }
}
