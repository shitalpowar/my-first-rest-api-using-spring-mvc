package com.xyz.myfirstrestapiusingspringmvc.service;

import com.xyz.myfirstrestapiusingspringmvc.dao.StudentDao;
import com.xyz.myfirstrestapiusingspringmvc.entity.Student;
import com.xyz.myfirstrestapiusingspringmvc.entity.Subjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao studentDao;

    @Override
    public boolean saveStudent(Student std) {
        return studentDao.saveStudent(std);
    }

    @Override
    public Student getStudent(int id) {
        return studentDao.getStudent(id)    ;
    }

    @Override
    public List<Student> getStudents() {
        return studentDao.getStudents() ;
    }

    @Override
    public boolean deleteStudent(int id) {
        return studentDao.deleteStudent(id);
    }

    @Override
    public Student updateStudent(Student std) {

        return studentDao.updateStudent(std);
    }

    @Override
    public List<Subjects> getSubjects() {
        return studentDao.getSubjects();
    }

    @Override
    public List<Subjects> getSubjectsById(int id) {
        return studentDao.getSubjectsById(id);
    }


}
