package com.example.secodRestTemplate.repository;

import com.example.secodRestTemplate.model.PostgresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoPostgresModel extends JpaRepository<PostgresModel, Long> {
}
