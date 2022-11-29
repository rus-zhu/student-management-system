package ru.ruszhu.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ruszhu.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
