package com.collateral.controller;

import com.collateral.dto.AddValuationDTO;
import com.collateral.dto.CollateralDTO;
import com.collateral.entity.Collateral;
import com.collateral.exception.CollateralException;

import java.util.List;

public interface ICollateralController {
    void addValuation(AddValuationDTO addValuationDTO) throws CollateralException;

    CollateralDTO getCollateralDetails(String collateralId) throws CollateralException;

    List<Collateral> all() throws CollateralException;
}
