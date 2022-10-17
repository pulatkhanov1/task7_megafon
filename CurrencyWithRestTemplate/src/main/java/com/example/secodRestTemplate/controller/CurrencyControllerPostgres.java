package com.example.secodRestTemplate.controller;

import com.example.secodRestTemplate.service.MongoRepositoryService;
import com.example.secodRestTemplate.service.PostgresRepositoryService;
import com.example.secodRestTemplate.service.ReaderFromUrl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import java.util.List;

@RestController
public class CurrencyControllerPostgres {
	private ReaderFromUrl readerFromUrl = new ReaderFromUrl();
	private final MongoRepositoryService mongoRepositoryService;
	private final PostgresRepositoryService repoService;

	public CurrencyControllerPostgres(MongoRepositoryService mongoRepositoryService, PostgresRepositoryService repoService) {
		this.mongoRepositoryService = mongoRepositoryService;
		this.repoService = repoService;
	}

	@GetMapping("secondCurrency")
	public List<? extends Object> getCurrency() {
		repoService.saveAllData(readerFromUrl.urlReader());
		mongoRepositoryService.saveDataToMongo(readerFromUrl.urlReaderMongo());
		try {
			return repoService.findAllData();
		} catch (RestClientException e) {

			try {
				System.out.println("postgres is not available");
				return mongoRepositoryService.getAllMongoData();
			} catch (RestClientException ex) {
				System.out.println("Databases are not available");
				return null;
			}
		}
	}
}
