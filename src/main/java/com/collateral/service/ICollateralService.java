package com.collateral.service;

import com.collateral.dto.AddValuationDTO;
import com.collateral.dto.CollateralDTO;
import com.collateral.entity.Collateral;
import com.collateral.exception.CollateralException;

import java.util.List;

public interface ICollateralService {
    void addValuation(AddValuationDTO addValuationDTO) throws CollateralException;

    CollateralDTO getCollateralDetails(String collateralId) throws CollateralException;

    List<Collateral> all() throws CollateralException;
}
