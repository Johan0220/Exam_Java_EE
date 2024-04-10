package com.fpt.edu.springboot_student.repositories;

import com.example.exam_EAD_sem4.entity.Student_score_t;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudent_scoreRepo extends JpaRepository<Student_score_t, Integer> {
}
