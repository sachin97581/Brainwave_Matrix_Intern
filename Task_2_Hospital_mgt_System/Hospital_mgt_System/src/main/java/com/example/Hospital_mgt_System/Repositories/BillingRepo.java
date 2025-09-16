package com.example.Hospital_mgt_System.Repositories;

import com.example.Hospital_mgt_System.models.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepo extends JpaRepository<Billing , Long> {
}
