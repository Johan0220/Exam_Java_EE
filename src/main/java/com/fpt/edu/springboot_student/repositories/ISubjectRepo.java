package com.fpt.edu.springboot_student.repositories;

import com.fpt.edu.springboot_student.models.Subject_t;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectRepo extends JpaRepository<Subject_t, Integer> {
}
