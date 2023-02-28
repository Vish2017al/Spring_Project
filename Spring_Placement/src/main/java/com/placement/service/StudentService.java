package com.placement.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.College;
import com.placement.entity.Student;
import com.placement.repository.StudentRepository;
 

@Service
@Transactional
public class StudentService {
 
	EntityManager entityManager;
	
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
    
    public Student update(Student student, Integer id) {
    	Student existStudent = stu.findById(id).get();
    	existStudent.setName(student.getName());
    	existStudent.setCollege(student.getCollege());
    	existStudent.setCourse(student.getCourse());
    	existStudent.setHallTicketNo(student.getHallTicketNo());
    	existStudent.setQualification(student.getQualification());
    	existStudent.setRoll(student.getRoll());
    	existStudent.setYear(student.getYear());
    	existStudent.setCertificate(student.getCertificate());
    	return existStudent;
    }
    
}