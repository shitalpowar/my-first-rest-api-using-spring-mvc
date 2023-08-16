package com.xyz.myfirstrestapiusingspringmvc.dao;

import com.xyz.myfirstrestapiusingspringmvc.entity.Student;
import com.xyz.myfirstrestapiusingspringmvc.entity.Subjects;

import java.util.List;

public interface StudentDao {
    public boolean saveStudent(Student std);
    public Student getStudent(int id);
    public List<Student> getStudents();
    public boolean deleteStudent(int id);
    public Student updateStudent(Student std);
    public List<Subjects> getSubjects();
    public List<Subjects> getSubjectsById(int id);

}
