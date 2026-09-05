package com.accounting.manager.controller;

import com.accounting.manager.model.CostSheet;
import com.accounting.manager.repository.CostSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/costsheet")
@CrossOrigin(origins = "http://localhost:5173")
public class CostSheetController {

    @Autowired
    private CostSheetRepository repository;

    @GetMapping
    public List<CostSheet> getAllEntries() {
        return repository.findAll();
    }

    @PostMapping
    public CostSheet createEntry(@RequestBody CostSheet entry) 
    {
        
        entry.calculateTotal();
        return repository.save(entry);
    }
    @DeleteMapping("/{id}")
    public void deleteEntry(@PathVariable Long id) {
        repository.deleteById(id);
    }
}