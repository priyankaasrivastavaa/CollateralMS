package com.collateral.controller.impl;

import com.collateral.controller.ICollateralController;
import com.collateral.dto.AddValuationDTO;
import com.collateral.dto.CollateralDTO;
import com.collateral.entity.Collateral;
import com.collateral.exception.CollateralException;
import com.collateral.service.impl.CollateralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CollateralController implements ICollateralController {
    @Autowired
    private CollateralService service;

    @Override
    @PostMapping("/collateral/addvaluation")
    public void addValuation(@RequestBody AddValuationDTO addValuationDTO) throws CollateralException {
        if (StringUtils.isEmpty(addValuationDTO.getCollateralId())) {
            throw new CollateralException("Collateral Id cannot be null");
        }
        service.addValuation(addValuationDTO.getCollateralId(), addValuationDTO.getValuationStatus());
    }

    @GetMapping("/collateral/{collateralId}")
    @Override
    public CollateralDTO getCollateralDetails(@PathVariable String collateralId) throws CollateralException {
        if (StringUtils.isEmpty(collateralId)) {
            throw new CollateralException("test");
        }
        return service.getCollateralDetails(collateralId);
    }

    @GetMapping("/collaterals")
    public List<Collateral> all() {
        return service.all();
    }
}
