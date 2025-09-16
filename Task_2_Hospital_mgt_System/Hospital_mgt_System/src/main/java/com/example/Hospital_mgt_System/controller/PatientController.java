package com.example.Hospital_mgt_System.controller;


import com.example.Hospital_mgt_System.Services.PatientService;
import com.example.Hospital_mgt_System.models.PatientEntity;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    // create patient
    @PostMapping(consumes = {"application/json", "application/json;charset=UTF-8"})
    public  ResponseEntity<PatientEntity> createPatient(@RequestBody PatientEntity patientEntity){
        PatientEntity patient = patientService.createPatient(patientEntity);

        return new ResponseEntity<>(patient , HttpStatus.CREATED);
    }

    // get patient by id
    @GetMapping("/{id}")
    public Optional<PatientEntity> getPatientById(@PathVariable long id){
        return patientService.getPatientById(id);
    }

    // update patient
    @PutMapping
    public PatientEntity updatePatient(@RequestBody PatientEntity patientEntity){
        return patientService.updatePatient(patientEntity);
    }
    // delete patient
    @DeleteMapping("/{id}")
    public void deletePatientById(@PathVariable Long id){
        patientService.deletePatientById(id);
    }
}

