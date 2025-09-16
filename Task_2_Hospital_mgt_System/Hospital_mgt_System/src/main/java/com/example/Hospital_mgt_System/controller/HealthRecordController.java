package com.example.Hospital_mgt_System.controller;

import com.example.Hospital_mgt_System.Services.HealthRecordsService;
import com.example.Hospital_mgt_System.models.HealthRecords;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/healthRecords")
public class HealthRecordController {


    private final HealthRecordsService healthRecordsService;

    public HealthRecordController(HealthRecordsService healthRecordsService){
        this.healthRecordsService = healthRecordsService;
    }

    // add health Record
    @PostMapping
    public ResponseEntity<HealthRecords> addHealthRecord(@RequestBody HealthRecords healthRecords){
        HealthRecords health = healthRecordsService.addHealthRecord(healthRecords);
        return new ResponseEntity<>(health , HttpStatus.CREATED);
    }

    // get health record by id
    @GetMapping("/{id}")
    public Optional<HealthRecords> getHealthRecordById(@RequestParam Long id){
        return healthRecordsService.getHealthRecordById(id);
    }

}
