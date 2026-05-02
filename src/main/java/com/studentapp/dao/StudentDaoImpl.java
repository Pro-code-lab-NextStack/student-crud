package com.studentapp.dao;

import com.studentapp.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.Collections;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private HibernateTemplate  hibernateTemplate;
    @Override
    public boolean saveStudent(Student student) {
        hibernateTemplate.save(student);
        return true;
    }

    @Override
    public boolean updateStudent(Student student) {
        hibernateTemplate.update(student);
        return true;
    }

    @Override
    public boolean deleteStudent(long id) {
       Student selectedStudent =hibernateTemplate.get(Student.class, id);
       hibernateTemplate.delete(selectedStudent);
        return true;
    }

    @Override
    public Student findStudentById(long id) {
      return hibernateTemplate.get(Student.class,id);
    }

    @Override
    public List<Student> findAllStudents() {

      return   hibernateTemplate.loadAll(Student.class);
    }
}
