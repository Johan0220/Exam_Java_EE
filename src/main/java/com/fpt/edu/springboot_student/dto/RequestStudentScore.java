package com.fpt.edu.springboot_student.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestStudentScore {

    private double score1;
    private double score2;

    private int student;
    private int subject;


}
