package com.fpt.edu.springboot_student.repositories;

import com.example.exam_EAD_sem4.entity.Subject_t;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectRepo extends JpaRepository<Subject_t, Integer> {
}
