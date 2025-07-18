package com.example.studentinfo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Departments")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentID")
    private Long departmentId;

    @Column(name = "FacultyName", nullable = false, length = 100)
    private String facultyName;

    @Column(name = "DepartmentName", nullable = false, length = 100)
    private String departmentName;
}
