package com.example.Hospital_mgt_System.Services;


import com.example.Hospital_mgt_System.Repositories.PatientRepo;
import com.example.Hospital_mgt_System.models.PatientEntity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {


    private final PatientRepo patientRepo;

    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public PatientEntity createPatient(PatientEntity patientEntity){
            return patientRepo.save(patientEntity);
    }

    public Optional<PatientEntity> getPatientById(Long id){
        return patientRepo.findById(id);
    }


    // in this problem when id not found server has crashed resolved it
    public PatientEntity updatePatient(PatientEntity patientEntity){
        try {
            if (patientEntity.getId() == null || !patientRepo.existsById(patientEntity.getId())){
                throw new RuntimeException("patient not available " + patientEntity.getId());
            }
        }catch (Exception e){
            throw new EntityNotFoundException("Patient not found by id " + e.getMessage());
        }

        return patientRepo.save(patientEntity);
    }

    public void deletePatientById(Long id){
         patientRepo.deleteById(id);
    }
}
