package com.cakeshop.cakeshop.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CakeRepository extends MongoRepository<Cake, ObjectId> {
}
