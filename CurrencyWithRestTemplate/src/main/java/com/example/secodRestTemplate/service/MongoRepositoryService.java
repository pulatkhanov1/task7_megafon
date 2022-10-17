package com.example.secodRestTemplate.service;

import com.example.secodRestTemplate.model.MongoModel;
import com.example.secodRestTemplate.repository.RepoMongoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoRepositoryService {

private final RepoMongoModel mongoRepo;

	public MongoRepositoryService(RepoMongoModel mongoRepo) {
		this.mongoRepo = mongoRepo;
	}

	public List<MongoModel> getAllMongoData(){
		return mongoRepo.findAll();
	}

	public void saveDataToMongo(List<MongoModel> data){
		mongoRepo.deleteAll();
		mongoRepo.saveAll(data);
	}
}
