package com.example.Hospital_mgt_System.Services;


import com.example.Hospital_mgt_System.Repositories.BillingRepo;
import com.example.Hospital_mgt_System.models.Billing;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    private final BillingRepo billingRepo;

    public BillingService(BillingRepo billingRepo){
        this.billingRepo = billingRepo;
    }

    public Billing createBill(Billing billing){
        return billingRepo.save(billing);
    }
}
