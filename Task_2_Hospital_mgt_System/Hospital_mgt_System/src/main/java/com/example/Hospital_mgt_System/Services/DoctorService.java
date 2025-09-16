package com.example.Hospital_mgt_System.Services;


import com.example.Hospital_mgt_System.Repositories.DoctorRepo;
import com.example.Hospital_mgt_System.models.DoctorEntity;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    private final DoctorRepo doctorRepo;

    public DoctorService(DoctorRepo doctorRepo){
        this.doctorRepo = doctorRepo;
    }

    public DoctorEntity createDoctor(DoctorEntity doctorEntity){
        return doctorRepo.save(doctorEntity);
    }

}
