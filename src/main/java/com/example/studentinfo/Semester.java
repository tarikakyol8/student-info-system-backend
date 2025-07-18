package com.example.studentinfo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Semesters")
@Data
public class Semester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SemesterID")
    private Long semesterId;

    @Column(name = "Year", nullable = false)
    private Integer year;

    @Column(name = "Term", nullable = false, length = 20)
    private String term;
}
