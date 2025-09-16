package com.example.Hospital_mgt_System.Services;


import com.example.Hospital_mgt_System.Repositories.MedicalSuppliesRepo;
import com.example.Hospital_mgt_System.models.MedicalSupplies;
import org.springframework.stereotype.Service;

@Service
public class MedicalSuppliesService {

    private final MedicalSuppliesRepo medicalSuppliesRepo;

    public MedicalSuppliesService(MedicalSuppliesRepo medicalSuppliesRepo){
        this.medicalSuppliesRepo = medicalSuppliesRepo;
    }

    public MedicalSupplies addMedicine(MedicalSupplies medicalSupplies){
        return medicalSuppliesRepo.save(medicalSupplies);
    }

}
