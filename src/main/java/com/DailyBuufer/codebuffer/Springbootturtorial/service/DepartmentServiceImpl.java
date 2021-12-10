package com.DailyBuufer.codebuffer.Springbootturtorial.service;

import com.DailyBuufer.codebuffer.Springbootturtorial.ErrorHandling.DeparmentExceptionHandling;
import com.DailyBuufer.codebuffer.Springbootturtorial.entity.Department;
import com.DailyBuufer.codebuffer.Springbootturtorial.repository.DeparmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DeparmentRepository deparmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return deparmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartement(Department department) {
        return deparmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentId(Long deparmentId) throws DeparmentExceptionHandling {
        Optional<Department> deparment =deparmentRepository.findById(deparmentId);
        if(!deparment.isPresent()){
            throw new DeparmentExceptionHandling("data not found ");
        }
        return deparment.get();
      /* Optional<Department> department = Optional.ofNullable(deparmentRepository.findById()).map(deparmentRepository.findById().get());
       return deparment; */

    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        /* if not null && not blank then only set the values*/
        Department depDB = deparmentRepository.findById(departmentId).get();
         if(Objects.nonNull(department.getDeparmentName()) && !"".equalsIgnoreCase(department.getDeparmentName())) {
             depDB.setDeparmentName(department.getDeparmentName());
         }

        if(Objects.nonNull(department.getDeparmentCode()) && !"".equalsIgnoreCase(department.getDeparmentCode())) {
            depDB.setDeparmentCode(department.getDeparmentCode());
        }

        if(Objects.nonNull(department.getDeparmentAddress()) && !"".equalsIgnoreCase(department.getDeparmentAddress())) {
            depDB.setDeparmentAddress(department.getDeparmentAddress());
        }

        return deparmentRepository.save(depDB);
    }
}
