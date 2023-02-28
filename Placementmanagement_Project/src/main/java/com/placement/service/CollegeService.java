package com.placement.service;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.College;
import com.placement.repository.CollegeRepository;
 

@Service
@Transactional

public class CollegeService {
    @Autowired
    private CollegeRepository clg;
     
    public List<College> listAll() {
        return clg.findAll();
    }
     
    public void save(College college) {
        clg.save(college);
    }
     
    public College get(Integer id) {
        return clg.findById(id).get();
    }
     
    public void delete(Integer id) {
        clg.deleteById(id);
    }
    

}
