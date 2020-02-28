package com.leoyas.geolocatorservice.dao;

import com.leoyas.geolocatorservice.model.Partner;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface PartnerRepository extends ReactiveMongoRepository<Partner, String> {

    Mono<Partner> findById(String id);
}
