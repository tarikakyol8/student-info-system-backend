package com.example.studentinfo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Courses")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CourseID")
    private Long courseId;

    @Column(name = "CourseCode", unique = true, nullable = false, length = 10)
    private String courseCode;

    @Column(name = "CourseName", nullable = false, length = 100)
    private String courseName;

    @Column(name = "Credits", nullable = false)
    private Integer credits;

    @ManyToOne
    @JoinColumn(name = "DepartmentID", nullable = false)
    private Department department;

    @Enumerated(EnumType.STRING)
    @Column(name = "CourseType", nullable = false)
    private CourseType courseType;
}
