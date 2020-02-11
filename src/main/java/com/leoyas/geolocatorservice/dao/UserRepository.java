package com.leoyas.geolocatorservice.dao;

import com.leoyas.geolocatorservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
}
