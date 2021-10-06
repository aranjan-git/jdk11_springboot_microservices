package com.java.learning.user.controller;

import com.java.learning.user.VO.ResponseTemplateVO;
import com.java.learning.user.entity.User;
import com.java.learning.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User createUser(@RequestBody User user){
        log.info("Inside createUser method of UserController.");
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long UserId){
        log.info("Inside findByUserId method of UserController.");
        return userService.getUserWithDepartment(UserId);
    }

}
