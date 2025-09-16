package com.example.Hospital_mgt_System.controller;


import com.example.Hospital_mgt_System.Services.AppointmentService;
import com.example.Hospital_mgt_System.models.Appointment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService){
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment){
        Appointment appointment1 = appointmentService.createAppointment(appointment);

        return new ResponseEntity<>(appointment1 , HttpStatus.CREATED);
    }
}
