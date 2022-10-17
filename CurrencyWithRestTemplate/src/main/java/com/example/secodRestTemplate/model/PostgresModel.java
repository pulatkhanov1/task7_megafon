package com.example.secodRestTemplate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "currency_table")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostgresModel {
	@Id
	@JsonProperty("id")
	@Column(name = "id")
	private Long id;
	@JsonProperty("Code")
	@Column(name = "code")
	private String code;
	@JsonProperty("Ccy")
	@Column(name = "ccy")
	private String ccy;
	@JsonProperty("CcyNm_RU")
	@Column(name = "ccyNm_RU")
	private String ccyNm_RU;
	@JsonProperty("CcyNm_UZ")
	@Column(name = "ccyNm_UZ")
	private String ccyNm_UZ;
	@JsonProperty("CcyNm_UZC")
	@Column(name = "ccyNm_UZC")
	private String ccyNm_UZC;
	@JsonProperty("CcyNm_EN")
	@Column(name = "ccyNm_EN")
	private String ccyNm_EN;
	@JsonProperty("Nominal")
	@Column(name = "nominal")
	private Integer nominal;
	@JsonProperty("Rate")
	@Column(name = "rate")
	private Double rate;
	@JsonProperty("Diff")
	@Column(name = "diff")
	private Double diff;
	@JsonProperty("Date")
	@Column(name = "date")
	private String date;
}
