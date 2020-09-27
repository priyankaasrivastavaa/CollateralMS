package com.collateral.builder;

import com.collateral.dto.CollateralDTO;
import com.collateral.entity.Collateral;
import org.springframework.stereotype.Component;

@Component
public class CollateralBuilder {

    public CollateralDTO build(Collateral collateral) {
        final CollateralDTO collateralDTO = new CollateralDTO();
        collateralDTO.setId(collateral.getId());
        collateralDTO.setCollateralType(collateral.getCollateralType());
        collateralDTO.setValId(collateral.getValId());
        collateralDTO.setCreatedDate(collateral.getCreatedDate());
        collateralDTO.setValuationStatus(collateral.getValuationStatus());
        collateralDTO.setLastUpdatedDate(collateral.getLastUpdatedDate());
        return collateralDTO;
    }
}
