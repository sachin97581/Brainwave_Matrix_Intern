package com.example.Hospital_mgt_System.Services;


import com.example.Hospital_mgt_System.Repositories.StaffRepo;
import com.example.Hospital_mgt_System.models.Staff;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepo staffRepo;

    public StaffService(StaffRepo staffRepo){
        this.staffRepo = staffRepo;
    }

    public Staff addStaff(Staff staff){
        return staffRepo.save(staff);
    }

    public Staff getStaffDetailById(Long id){
        return staffRepo.getReferenceById(id);
    }

    public void deleteStaffById(Long id){
        staffRepo.deleteById(id);
    }
}
