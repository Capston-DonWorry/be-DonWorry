package com.example.demo.service;

import com.example.demo.entity.Expenditure;
import com.example.demo.repository.ExpenditureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ExpenditureService {

    @Autowired
    private ExpenditureRepository expenditureRepository;

    public Expenditure addExpenditure(Long userId, Double amount, String details, String category, LocalDateTime date) {
        Expenditure expenditure = new Expenditure();
        expenditure.setUserId(userId);
        expenditure.setAmount(amount);
        expenditure.setDetails(details);
        expenditure.setCategory(category);
        expenditure.setDate(date);

        return expenditureRepository.save(expenditure);
    }

    public List<Expenditure> getExpendituresByUserId(Long userId) {
        return expenditureRepository.findAllByUserId(userId);
    }
}
