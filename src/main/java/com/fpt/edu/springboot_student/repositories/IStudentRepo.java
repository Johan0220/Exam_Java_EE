package com.fpt.edu.springboot_student.repositories;

import com.fpt.edu.springboot_student.models.Student_t;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student_t, Integer> {

}
