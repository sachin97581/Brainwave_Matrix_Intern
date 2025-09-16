package com.example.Hospital_mgt_System.controller;


import com.example.Hospital_mgt_System.Services.MedicalSuppliesService;
import com.example.Hospital_mgt_System.models.MedicalSupplies;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/medicine")
public class MedicalSuppliesController {

    private final MedicalSuppliesService medicalSuppliesService;

    public MedicalSuppliesController(MedicalSuppliesService medicalSuppliesService){
        this.medicalSuppliesService = medicalSuppliesService;
    }

    // add medicine
    @PostMapping
    public ResponseEntity<MedicalSupplies> addMedicine(@RequestBody MedicalSupplies medicalSupplies){
        MedicalSupplies medicalSupplies1 = medicalSuppliesService.addMedicine(medicalSupplies);
        return new ResponseEntity<>(medicalSupplies1 , HttpStatus.CREATED);
    }
}
