package com.xyz.myfirstrestapiusingspringmvc.service;

import com.xyz.myfirstrestapiusingspringmvc.entity.Student;
import com.xyz.myfirstrestapiusingspringmvc.entity.Subjects;

import java.util.List;


public interface StudentService {
    public boolean saveStudent(Student std);
    public Student getStudent(int id);
    public List<Student> getStudents();
    public boolean deleteStudent(int id);
    public Student updateStudent(Student std);
    public List<Subjects> getSubjects();
    public List<Subjects> getSubjectsById(int id);



}
