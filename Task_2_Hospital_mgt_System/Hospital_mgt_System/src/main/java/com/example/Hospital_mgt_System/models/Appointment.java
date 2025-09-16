package com.example.Hospital_mgt_System.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
//@EntityListeners(AuditingEntityListener.class)
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @CreatedDate
//    @Column(nullable = false, updatable = false)
    private LocalDateTime appointmentDate;
    private String status;  // Scheduled, Completed, Cancelled

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @JsonBackReference(value = "patient_appointment")
    private PatientEntity patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    @JsonBackReference(value = "doctor_appointment")
    private DoctorEntity doctor;

}
