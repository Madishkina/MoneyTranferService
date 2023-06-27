package ru.netology.moneytransferservice.service;

import ru.netology.moneytransferservice.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<String> getProductName(String customerName) {
        return repository.getProductName(customerName);
    }
}