package com.placement.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

import com.placement.entity.College;
import com.placement.service.CollegeService;
 

@RestController
@CrossOrigin(origins = "*") 
public class CollegeController {
 
    @Autowired
    private CollegeService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/college")
    public List<College> list() {
        return service.listAll();
    }
    @GetMapping("/college/{id}")
    public ResponseEntity<College> get(@PathVariable Integer id) {
        try {
        	College college = service.get(id);
            return new ResponseEntity<College>(college, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Create operation
    @PostMapping("/college")
    public void add(@RequestBody College college) {
        service.save(college);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/college/{id}")
    public ResponseEntity<?> update(@RequestBody College college, @PathVariable Integer id) {
        try {
        	College existCollege = service.update(college, id);;
            service.save(existCollege);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Delete operation
    @DeleteMapping("/college/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
   
}