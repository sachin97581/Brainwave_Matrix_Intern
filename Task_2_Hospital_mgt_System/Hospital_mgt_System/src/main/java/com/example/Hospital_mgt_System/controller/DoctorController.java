package com.example.Hospital_mgt_System.controller;


import com.example.Hospital_mgt_System.Services.DoctorService;
import com.example.Hospital_mgt_System.models.DoctorEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService){
        this.doctorService = doctorService;
    }

    // create doctor
    @PostMapping
    public ResponseEntity<DoctorEntity> createDoctor(@RequestBody DoctorEntity doctorEntity){
        DoctorEntity doctor = doctorService.createDoctor(doctorEntity);

        return new ResponseEntity<>(doctor , HttpStatus.CREATED);
    }
}
