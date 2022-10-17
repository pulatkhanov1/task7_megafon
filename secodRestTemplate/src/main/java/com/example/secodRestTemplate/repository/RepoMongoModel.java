package com.example.secodRestTemplate.repository;

import com.example.secodRestTemplate.model.MongoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoMongoModel extends MongoRepository<MongoModel, Long> {
}
