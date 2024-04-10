package com.fpt.edu.springboot_student.repositories;

import com.fpt.edu.springboot_student.models.Student_score_t;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudent_scoreRepo extends JpaRepository<Student_score_t, Integer> {
}
