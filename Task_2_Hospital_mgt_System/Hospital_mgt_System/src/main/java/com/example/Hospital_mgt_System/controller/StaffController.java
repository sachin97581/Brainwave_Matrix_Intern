package com.example.Hospital_mgt_System.controller;

import com.example.Hospital_mgt_System.Services.StaffService;
import com.example.Hospital_mgt_System.models.Staff;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/staff")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService){
        this.staffService  = staffService;
    }

    // add staff
    @PostMapping
    public ResponseEntity<Staff> addStaff(@RequestBody Staff staff){
        Staff staff1 = staffService.addStaff(staff);

        return new ResponseEntity<>(staff , HttpStatus.CREATED);
    }

    // get staff detail by id
    @GetMapping("/{id}")
    public Staff getStaffDetailById(@PathVariable Long id){
        return staffService.getStaffDetailById(id);
    }

    // delete staff by id
    @DeleteMapping("/{id}")
    public void deleteStaffById(@PathVariable Long id){
        staffService.deleteStaffById(id);
    }
}
