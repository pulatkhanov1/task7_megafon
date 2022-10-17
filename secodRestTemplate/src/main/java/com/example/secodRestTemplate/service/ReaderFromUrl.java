package com.example.secodRestTemplate.service;

import com.example.secodRestTemplate.model.MongoModel;
import com.example.secodRestTemplate.model.PostgresModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReaderFromUrl {

	public static List<PostgresModel> urlReader() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://cbu.uz/ru/arkhiv-kursov-valyut/json/";
		ResponseEntity<Object[]> response =
				restTemplate.getForEntity(url, Object[].class);
		Object[] objects = response.getBody();
		ObjectMapper objectMapper = new ObjectMapper();
		return Arrays.stream(objects)
				.map(object -> objectMapper.convertValue(object, PostgresModel.class))
				.collect(Collectors.toList());
	}

	public static List<MongoModel> urlReaderMongo() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://cbu.uz/ru/arkhiv-kursov-valyut/json/";
		ResponseEntity<Object[]> response =
				restTemplate.getForEntity(url, Object[].class);
		Object[] objects = response.getBody();
		ObjectMapper objectMapper = new ObjectMapper();
		return Arrays.stream(objects)
				.map(object -> objectMapper.convertValue(object, MongoModel.class))
				.collect(Collectors.toList());
	}
}
