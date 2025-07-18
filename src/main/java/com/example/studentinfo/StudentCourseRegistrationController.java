package com.example.studentinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrations")
public class StudentCourseRegistrationController {

    @Autowired
    private StudentCourseRegistrationRepository registrationRepository;

    @GetMapping
    public List<StudentCourseRegistration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    @PostMapping
    public StudentCourseRegistration createRegistration(@RequestBody StudentCourseRegistration registration) {
        return registrationRepository.save(registration);
    }
}
