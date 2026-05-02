package com.studentapp.dao;

import com.studentapp.entity.Student;

import java.util.Collections;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public boolean saveStudent(Student student) {
        return false;
    }

    @Override
    public boolean updateStudent(Student student) {
        return false;
    }

    @Override
    public boolean deleteStudent(Student student) {
        return false;
    }

    @Override
    public Student findStudentById(long id) {
        return null;
    }

    @Override
    public List<Student> findAllStudents() {
        return Collections.emptyList();
    }
}
