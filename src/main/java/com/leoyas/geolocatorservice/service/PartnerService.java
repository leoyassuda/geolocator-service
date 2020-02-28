package com.leoyas.geolocatorservice.service;

import com.leoyas.geolocatorservice.dao.PartnerRepository;
import com.leoyas.geolocatorservice.model.Partner;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Log4j2
@Service
public class PartnerService {

    @Autowired
    private PartnerRepository partnerRepository;

    /**
     * Find a {@link Partner} by Id.
     *
     * @param id a {@link String} ID's Partner.
     * @return a {@link Partner} founded.
     */
    public Mono<Partner> findById(String id) {
        log.info("PartnerService#findById partnerId={}", () -> id);
        return partnerRepository.findById(id);
    }

}
