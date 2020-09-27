package com.collateral.dto;


import java.time.LocalDateTime;

public class CollateralDTO {


    private Long id;


    private String collateralType;


    private Long valId;


    private String valuationStatus;


    private LocalDateTime lastUpdatedDate;


    private LocalDateTime createdDate;

    public CollateralDTO() {
    }

    public CollateralDTO(Long id, String collateralType) {
        this.id = id;
        this.collateralType = collateralType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public Long getValId() {
        return valId;
    }

    public CollateralDTO setValId(Long valId) {
        this.valId = valId;
        return this;
    }

    public String getValuationStatus() {
        return valuationStatus;
    }

    public void setValuationStatus(String valuationStatus) {
        this.valuationStatus = valuationStatus;
    }

    public LocalDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Collateral{" +
                "id=" + id +
                ", collateralType='" + collateralType + '\'' +
                ", valuationStatus='" + valuationStatus + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", createdDate=" + createdDate +
                '}';
    }

}