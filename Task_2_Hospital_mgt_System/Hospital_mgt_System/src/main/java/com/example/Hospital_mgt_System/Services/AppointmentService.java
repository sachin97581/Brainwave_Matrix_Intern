package com.example.Hospital_mgt_System.Services;


import com.example.Hospital_mgt_System.Repositories.AppointmentRepo;
import com.example.Hospital_mgt_System.models.Appointment;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    private final AppointmentRepo appointmentRepo;

    public AppointmentService(AppointmentRepo appointmentRepo){
        this.appointmentRepo = appointmentRepo;
    }

    public Appointment createAppointment(Appointment appointment){
        return appointmentRepo.save(appointment);
    }
}
