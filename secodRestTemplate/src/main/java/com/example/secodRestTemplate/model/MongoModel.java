package com.example.secodRestTemplate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
@Data
@Document(collection = "currencycol")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MongoModel {

	@Id
	@JsonProperty("id")
	@Field("_id")
	private Long id;
	@JsonProperty("Code")
	private String code;
	@JsonProperty("Ccy")
	private String ccy;
	@JsonProperty("CcyNm_RU")
	private String ccyNm_RU;
	@JsonProperty("CcyNm_UZ")
	private String ccyNm_UZ;
	@JsonProperty("CcyNm_UZC")
	private String ccyNm_UZC;
	@JsonProperty("CcyNm_EN")
	private String ccyNm_EN;
	@JsonProperty("Nominal")
	private Integer nominal;
	@JsonProperty("Rate")
	private Double rate;
	@JsonProperty("Diff")
	private Double diff;
	@JsonProperty("Date")
	private String date;
}
