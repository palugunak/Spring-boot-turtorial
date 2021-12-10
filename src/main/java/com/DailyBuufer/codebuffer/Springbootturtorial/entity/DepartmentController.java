package com.DailyBuufer.codebuffer.Springbootturtorial.entity;

import com.DailyBuufer.codebuffer.Springbootturtorial.ErrorHandling.DeparmentExceptionHandling;
import com.DailyBuufer.codebuffer.Springbootturtorial.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside the post call for the deparmentcontroller");
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/departments")
    public List<Department> fetchDeparment(Department department){
          return departmentService.fetchDepartement(department);
    }

    @GetMapping("/departments/{id}")
    public Department fetchDeparmentbyId(@PathVariable("id") Long deparmentId) throws DeparmentExceptionHandling {
       return departmentService.fetchDepartmentId(deparmentId);
    }
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department){
        return  departmentService.updateDepartment(departmentId,department);

    }





}
