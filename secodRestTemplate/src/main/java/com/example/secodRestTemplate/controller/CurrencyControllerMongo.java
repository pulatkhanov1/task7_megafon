package com.example.secodRestTemplate.controller;

import com.example.secodRestTemplate.model.MongoModel;
import com.example.secodRestTemplate.service.MongoRepositoryService;
import com.example.secodRestTemplate.service.ReaderFromUrl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyControllerMongo {

	private ReaderFromUrl reader = new ReaderFromUrl();
	private final MongoRepositoryService service;

	public CurrencyControllerMongo(MongoRepositoryService service) {
		this.service = service;
	}

	@GetMapping("/currencyMongo")
	public List<MongoModel> getMongoData(){
	service.saveDataToMongo(reader.urlReaderMongo());
	return service.getAllMongoData();
	}
}
