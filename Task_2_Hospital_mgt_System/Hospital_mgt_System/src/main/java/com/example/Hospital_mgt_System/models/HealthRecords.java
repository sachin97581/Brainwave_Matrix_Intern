package com.example.Hospital_mgt_System.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class HealthRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diagnosis;
    private String treatment;
    private String prescription;
    @CreatedDate
    @Column(nullable = false , updatable = false)
    private LocalDate recordDate;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @JsonBackReference
    private PatientEntity patient;

}
