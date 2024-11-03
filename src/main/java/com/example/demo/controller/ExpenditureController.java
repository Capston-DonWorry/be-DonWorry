package com.example.demo.controller;

import com.example.demo.entity.Expenditure;
import com.example.demo.service.ExpenditureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/expenditure")
public class ExpenditureController {

    @Autowired
    private ExpenditureService expenditureService;

    @PostMapping("/add")
    public ResponseEntity<?> addExpenditure(
            @RequestParam Long userId,
            @RequestParam Double amount,
            @RequestParam String details,
            @RequestParam String category,
            @RequestParam LocalDateTime date) {

        Expenditure expenditure = expenditureService.addExpenditure(userId, amount, details, category, date);
        return ResponseEntity.ok(expenditure);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Expenditure>> getExpenditures(@PathVariable Long userId) {
        List<Expenditure> expenditures = expenditureService.getExpendituresByUserId(userId);
        return ResponseEntity.ok(expenditures);
    }
}
