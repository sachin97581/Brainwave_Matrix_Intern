package com.example.Hospital_mgt_System.Repositories;


import com.example.Hospital_mgt_System.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staff , Long> {
}
