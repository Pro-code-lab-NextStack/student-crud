package com.studentapp.dao;

import com.studentapp.entity.Student;

import java.util.List;

public interface StudentDao {
    public boolean saveStudent(Student student);
    public boolean updateStudent(Student student);
    public boolean deleteStudent(long id);
    public Student findStudentById(long id);
    public List<Student> findAllStudents();
}
