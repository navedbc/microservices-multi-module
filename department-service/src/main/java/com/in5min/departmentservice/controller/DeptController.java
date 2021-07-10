package com.in5min.departmentservice.controller;

import com.in5min.departmentservice.model.Dept;
import com.in5min.departmentservice.service.DeptService;
import com.in5min.departmentservice.vo.DeptUserVO;
import lombok.experimental.PackagePrivate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/dept")
@EnableEurekaClient
@Slf4j
public class DeptController {

    @Autowired
    DeptService deptService;

    @GetMapping("/{id}")
    public Dept getDepartmentById(@PathVariable Long id){

        return deptService.getDepartmentById(id);
    }

    @PostMapping
    public Dept saveDepartment(@RequestBody Dept dept){
        return deptService.saveDepartment(dept);
    }

    @GetMapping("/vo/{id}")
    public DeptUserVO getDepartmentUserVo(@PathVariable Long id){
        return deptService.getUserDeptVO(id);
    }


}
