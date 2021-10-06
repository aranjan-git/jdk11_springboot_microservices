package com.java.learning.user.service;

import com.java.learning.user.VO.Department;
import com.java.learning.user.VO.ResponseTemplateVO;
import com.java.learning.user.entity.User;
import com.java.learning.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User createUser(User user) {
        log.info("Inside createUser method of UserService.");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment method of UserService.");
        ResponseTemplateVO responseTemplateVO=new ResponseTemplateVO();
        User user=userRepository.findByUserId(userId);
        Department department= restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);

        return responseTemplateVO;
    }
}
