package com.in5min.departmentservice.service;

import com.in5min.departmentservice.model.Dept;
import com.in5min.departmentservice.repository.DeptRepository;
import com.in5min.departmentservice.vo.DeptUserVO;
import com.in5min.departmentservice.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeptService {

    @Autowired
    DeptRepository deptRepository;

    @Autowired
    RestTemplate restTemplate;


    public Dept getDepartmentById(Long id) {
        Dept dept=deptRepository.getById(id);
        return dept;
    }

    public Dept saveDepartment(Dept dept) {
        return deptRepository.save(dept);
    }


    public DeptUserVO getUserDeptVO(Long id){
        Dept dept=deptRepository.getById(id);
       User user= restTemplate.getForObject("http://USER-SERVICE/user/1",User.class);
        DeptUserVO vo=new DeptUserVO(dept,user);
        return vo;

    }
}
