package com.java.learning.department.service;

import com.java.learning.department.entity.Department;
import com.java.learning.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department) {
        log.info("Inside createDepartment method for DepartmentService.");
        return departmentRepository.save(department);
    }


    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside findByDepartmentId method for DepartmentService.");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
