package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "expenditures")
public class Expenditure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "details", nullable = false)
    private String details;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

}

