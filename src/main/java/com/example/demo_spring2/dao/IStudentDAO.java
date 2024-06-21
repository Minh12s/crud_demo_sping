package com.example.demo_spring2.dao;

import com.example.demo_spring2.entity.ClassRoom;
import com.example.demo_spring2.entity.Student;
import jakarta.transaction.Transactional;

import java.util.List;

public interface IStudentDAO {
    void saveStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
    void deleteStudent(Student student);

}
