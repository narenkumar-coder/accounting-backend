package com.accounting.manager.repository;

import com.accounting.manager.model.CostSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostSheetRepository extends JpaRepository<CostSheet, Long> {
}