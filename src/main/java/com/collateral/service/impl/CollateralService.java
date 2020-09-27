package com.collateral.service.impl;

import com.collateral.builder.CollateralBuilder;
import com.collateral.dto.CollateralDTO;
import com.collateral.entity.Collateral;
import com.collateral.entity.Status;
import com.collateral.exception.CollateralException;
import com.collateral.repository.CollateralRepository;
import com.collateral.service.ICollateralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollateralService implements ICollateralService {
    @Autowired
    private CollateralRepository repository;

    @Autowired
    private CollateralBuilder builder;

    @Override
    public void addValuation(String collateralId, Status valuationStatus) throws CollateralException {
        long id = Long.parseLong(collateralId);
        Collateral entity = repository.findById(id);
        if (null == entity) {
            throw new CollateralException(String.
                    format("Collateral not forund for collateral id ; %s", collateralId));
        }
        entity.setValuationStatus(Status.COMPLETED.toString());
        repository.save(entity);
    }

    @Override
    public CollateralDTO getCollateralDetails(String collateralId) {
        long id = Long.parseLong(collateralId);
        Collateral entity = repository.findById(id);
        return builder.build(entity);
    }

    @Override
    public List<Collateral> all() {
        return repository.findAll();
    }

}
