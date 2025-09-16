package com.example.Hospital_mgt_System.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Billing {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private String paymentStatus; // Paid, Pending, Failed
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDate billingDate;

    @ManyToOne
    @JoinColumn(name = "patient_id")
//    @JsonIgnore
    @JsonBackReference
    private PatientEntity patient;
}
