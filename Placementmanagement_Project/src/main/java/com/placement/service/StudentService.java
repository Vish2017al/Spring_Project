package com.placement.service;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.Student;
import com.placement.repository.StudentRepository;
 

@Service
@Transactional

public class StudentService {
    @Autowired
    private StudentRepository stu;
     
    public List<Student> listAll() {
        return stu.findAll();
    }
     
    public void save(Student student) {
        stu.save(student);
    }
     
    public Student get(Integer id) {
        return stu.findById(id).get();
    }
     
    public void delete(Integer id) {
        stu.deleteById(id);
    }

}
