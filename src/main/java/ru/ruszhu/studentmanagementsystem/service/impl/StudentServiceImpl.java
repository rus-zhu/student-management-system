package ru.ruszhu.studentmanagementsystem.service.impl;

import org.springframework.stereotype.Service;
import ru.ruszhu.studentmanagementsystem.entity.Student;
import ru.ruszhu.studentmanagementsystem.repository.StudentRepository;
import ru.ruszhu.studentmanagementsystem.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}
