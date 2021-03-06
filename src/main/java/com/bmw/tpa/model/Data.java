
package com.bmw.tpa.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "month", "value" })
public class Data {

	@JsonProperty("month")
	private Integer month;
	@JsonProperty("value")
	private Double value;
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("month")
	public Integer getMonth() {
		return month;
	}

	@JsonProperty("month")
	public void setMonth(Integer month) {
		this.month = month;
	}

	@JsonProperty("value")
	public Double getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(Double value) {
		this.value = value;
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}