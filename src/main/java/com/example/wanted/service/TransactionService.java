package com.example.wanted.service;

import com.example.wanted.model.Transaction;
import com.example.wanted.repository.TransactionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    @Transactional
    public void insert(Transaction transaction) {
        transactionRepository.save(transaction);
    }

//    public List<Transaction> list(Long id) {
//        return orderRepository.findByProductId(id);
//    }

    public Long findByBuyerId(Long id) {
        return transactionRepository.findByBuyerId(id);
    }

    public List<Transaction> purchaseList(Long id) {
        return transactionRepository.findByBuyId(id);
    }

    public List<Transaction> sellList(Long id) {
        return transactionRepository.findBySellId(id);
    }

//    public List<Transaction> allTransactions(Long id) {
//        return orderRepository.findAllByUserId(id);
//    }
}