package com.example.Hospital_mgt_System.Services;


import com.example.Hospital_mgt_System.Repositories.HealthRecordsRepo;
import com.example.Hospital_mgt_System.models.HealthRecords;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HealthRecordsService {

    private final HealthRecordsRepo healthRecordsRepo;

    public HealthRecordsService(HealthRecordsRepo healthRecordsRepo){
        this.healthRecordsRepo = healthRecordsRepo;
    }

    public HealthRecords addHealthRecord(HealthRecords healthRecords){
        return healthRecordsRepo.save(healthRecords);
    }

    // get health records
    public Optional<HealthRecords> getHealthRecordById(Long id){
        return Optional.of(healthRecordsRepo.getReferenceById(id));
    }
}
