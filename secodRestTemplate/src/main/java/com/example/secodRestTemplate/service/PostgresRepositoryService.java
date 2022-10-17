package com.example.secodRestTemplate.service;

import com.example.secodRestTemplate.model.PostgresModel;
import com.example.secodRestTemplate.repository.RepoPostgresModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostgresRepositoryService {

	private final RepoPostgresModel repoPostgresModel;

	public PostgresRepositoryService(RepoPostgresModel repoPostgresModel) {
		this.repoPostgresModel = repoPostgresModel;
	}

	public List<PostgresModel> findAllData() {
		return repoPostgresModel.findAll();
	}

	public void saveAllData(List<PostgresModel> postgresModel) {
		repoPostgresModel.saveAll(postgresModel);
	}
}
