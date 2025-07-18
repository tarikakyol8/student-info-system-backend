package com.example.studentinfo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentID")
    private Long studentId;

    @Column(name = "FirstName", nullable = false, length = 50)
    private String firstName;

    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;

    @Column(name = "StudentNumber", unique = true, nullable = false, length = 20)
    private String studentNumber;

    @Column(name = "Email", unique = true, nullable = false, length = 100)
    private String email;

    @ManyToOne
    @JoinColumn(name = "DepartmentID")
    private Department department;

    @Column(name = "RegistrationDate", nullable = false)
    private LocalDate registrationDate;
}
