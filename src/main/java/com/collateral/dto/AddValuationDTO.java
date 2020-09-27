package com.collateral.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddValuationDTO {

    @JsonProperty("collateralId")
    private String collateralId;

    @JsonProperty("valuationStatus")
    private Status valuationStatus;

    public String getCollateralId() {
        return collateralId;
    }

    public AddValuationDTO setCollateralId(String collateralId) {
        this.collateralId = collateralId;
        return this;
    }

    public Status getValuationStatus() {
        return valuationStatus;
    }

    public AddValuationDTO setValuationStatus(Status valuationStatus) {
        this.valuationStatus = valuationStatus;
        return this;
    }
}
