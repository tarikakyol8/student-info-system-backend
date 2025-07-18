package com.example.studentinfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRegistrationRepository extends JpaRepository<StudentCourseRegistration, Long> {
}
