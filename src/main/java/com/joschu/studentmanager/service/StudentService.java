package com.joschu.studentmanager.service;

import com.joschu.studentmanager.exception.UserNotFoundException;
import com.joschu.studentmanager.model.Student;
import com.joschu.studentmanager.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student){
      student.setStudentID(UUID.randomUUID().toString());
      return studentRepo.save(student);
    }

    public List<Student> findAllStudents() {
        return studentRepo.findAll();
    }

    public Student updateStudent(Student student){
        return studentRepo.save(student);
    }

    public Student findStudentById(long id){
        return studentRepo.findStudentById(id)
                .orElseThrow(() -> new UserNotFoundException("User of ID" + id + "not found"));
    }

    public void deleteStudent(Long id){
        studentRepo.deleteStudentById(id);
    }
}
