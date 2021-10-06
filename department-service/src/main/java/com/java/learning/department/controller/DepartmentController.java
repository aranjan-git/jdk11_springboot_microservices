package com.java.learning.department.controller;

import com.java.learning.department.entity.Department;
import com.java.learning.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department createDepartment(@RequestBody Department department){
        log.info("Inside createDepartment method of DepartmentController.");
        return departmentService.createDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId){
        log.info("Inside findByDepartmentId method of DepartmentController.");
        return departmentService.findByDepartmentId(departmentId);
    }


}
