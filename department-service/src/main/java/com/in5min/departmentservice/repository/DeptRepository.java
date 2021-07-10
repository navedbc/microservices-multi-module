package com.in5min.departmentservice.repository;

import com.in5min.departmentservice.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository  extends JpaRepository<Dept,Long> {

}
