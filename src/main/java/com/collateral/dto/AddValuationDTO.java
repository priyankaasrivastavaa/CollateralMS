package com.collateral.dto;

public class AddValuationDTO {
    private String collateralId;
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
