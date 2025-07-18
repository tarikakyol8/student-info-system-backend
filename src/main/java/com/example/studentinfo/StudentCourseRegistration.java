package com.example.studentinfo;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "StudentCourseRegistrations")
@Data
public class StudentCourseRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RegistrationID")
    private Long registrationId;

    @ManyToOne
    @JoinColumn(name = "StudentID", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "CourseID", nullable = false)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "SemesterID", nullable = false)
    private Semester semester;

    @Column(name = "Grade", precision = 3, scale = 2)
    private BigDecimal grade;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status", nullable = false)
    private CourseStatus status;
}
