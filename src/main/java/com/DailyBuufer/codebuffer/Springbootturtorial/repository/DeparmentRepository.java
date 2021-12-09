package com.DailyBuufer.codebuffer.Springbootturtorial.repository;

import com.DailyBuufer.codebuffer.Springbootturtorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeparmentRepository extends JpaRepository<Department,Long> {
}
