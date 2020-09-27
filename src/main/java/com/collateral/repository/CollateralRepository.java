package com.collateral.repository;

import com.collateral.entity.Collateral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.time.LocalDateTime;
import java.util.List;

@Repository
@Transactional
public class CollateralRepository {
    @Autowired
    EntityManager em;

    public Collateral findById(Long id) {
        return em.find(Collateral.class, id);
    }

    public void save(Collateral collateral) {
        collateral.setLastUpdatedDate(LocalDateTime.now());
        Collateral temp = findById(collateral.getId());
        if (temp == null) {
            em.persist(collateral);
        } else {
            em.merge(collateral);
        }
    }

    public List<Collateral> findAll() {
        Query query = em.createQuery("SELECT e FROM Collateral e");
        return (List<Collateral>) query.getResultList();
    }
}
