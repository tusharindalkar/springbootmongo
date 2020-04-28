package com.springMongo.speingMongoProjetc.Repository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springMongo.speingMongoProjetc.Pojo.Pets;

public interface PetsRepository extends MongoRepository<Pets, ObjectId> {
  Pets findBy_id(ObjectId _id);
}