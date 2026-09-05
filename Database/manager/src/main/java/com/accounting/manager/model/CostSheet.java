package com.accounting.manager.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cost_sheet_entries")
public class CostSheet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long entryId;
    
    private String projectName;
    private Double directMaterial;
    private Double directLabor;
    private Double factoryOverhead;
    private Double totalCost;

    public CostSheet() {}

    public void calculateTotal() {
        this.totalCost = this.directMaterial + this.directLabor + this.factoryOverhead;
    }

    public Long getEntryId() { return entryId; }
    public void setEntryId(Long entryId) { this.entryId = entryId; }
    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }
    public Double getDirectMaterial() { return directMaterial; }
    public void setDirectMaterial(Double directMaterial) { this.directMaterial = directMaterial; }
    public Double getDirectLabor() { return directLabor; }
    public void setDirectLabor(Double directLabor) { this.directLabor = directLabor; }
    public Double getFactoryOverhead() { return factoryOverhead; }
    public void setFactoryOverhead(Double factoryOverhead) { this.factoryOverhead = factoryOverhead; }
    public Double getTotalCost() { return totalCost; }
}