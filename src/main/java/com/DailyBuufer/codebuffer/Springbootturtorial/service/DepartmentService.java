package com.DailyBuufer.codebuffer.Springbootturtorial.service;

import com.DailyBuufer.codebuffer.Springbootturtorial.ErrorHandling.DeparmentExceptionHandling;
import com.DailyBuufer.codebuffer.Springbootturtorial.entity.Department;

import java.util.List;

public interface DepartmentService {

     public Department saveDepartment(Department department);

     public List<Department> fetchDepartement(Department department);

     Department fetchDepartmentId(Long deparmentId) throws DeparmentExceptionHandling;

     Department updateDepartment(Long departmentId, Department department);
}
