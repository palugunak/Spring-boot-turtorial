package com.DailyBuufer.codebuffer.Springbootturtorial.entity;

import com.DailyBuufer.codebuffer.Springbootturtorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/departments")
    public List<Department> fetchDeparment(Department department){
          return departmentService.fetchDepartement(department);
    }

    @GetMapping("/departments/{id}")
    public Department fetchDeparmentbyId(@PathVariable("id") Long deparmentId){
       return departmentService.fetchDepartmentId(deparmentId);
    }
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department){
        return  departmentService.updateDepartment(departmentId,department);

    }





}
