package com.DailyBuufer.codebuffer.Springbootturtorial.service;

import com.DailyBuufer.codebuffer.Springbootturtorial.ErrorHandling.DeparmentExceptionHandling;
import com.DailyBuufer.codebuffer.Springbootturtorial.entity.Department;
import com.DailyBuufer.codebuffer.Springbootturtorial.repository.DeparmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentservice;

    @MockBean
    private DeparmentRepository deparmentRepository;

    @BeforeEach
    void setUp(){

        Department department = new Department((long) 17, "IT","BANGLORE","IT-06");
        Mockito.when(deparmentRepository.findById((long) 17)).thenReturn(java.util.Optional.of(department));

    }



    @Test
    public void validatefetchDepartementID_whenDepartmentshouldfound() throws DeparmentExceptionHandling {

        Long departmentID = Long.valueOf(17);
        Department found = departmentservice.fetchDepartmentId(departmentID);

        assertEquals(departmentID,found.getDeparmentId());


    }






}