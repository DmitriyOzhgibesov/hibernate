package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.repository.HibernateRepository;

import java.util.List;

@RestController
public class HibernateController {
    private final HibernateRepository hibernateRepository;

    public HibernateController( HibernateRepository hibernateRepository) {
        this.hibernateRepository = hibernateRepository;
    }

    @GetMapping("/persons/by-city")
    public String getSqlSetup(@RequestParam String city) {
        return hibernateRepository.getPersonsByCity(city).toString();
    }
}