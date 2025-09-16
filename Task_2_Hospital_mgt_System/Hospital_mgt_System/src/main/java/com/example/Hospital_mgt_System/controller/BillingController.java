package com.example.Hospital_mgt_System.controller;

import com.example.Hospital_mgt_System.Services.BillingService;
import com.example.Hospital_mgt_System.models.Billing;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bills")
public class BillingController {

    private final BillingService billingService;

    public BillingController(BillingService billingService){
        this.billingService = billingService;
    }

    // create bill
    @PostMapping
    public ResponseEntity<Billing> createBill(@RequestBody Billing billing){
        Billing bill = billingService.createBill(billing);
        return new ResponseEntity<>(bill , HttpStatus.CREATED);
    }
}
