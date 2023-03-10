package com.placement.service;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.Placement;
import com.placement.repository.PlacementRepository;
 

@Service
@Transactional

public class PlacementService {
    @Autowired
    private PlacementRepository plc;
     
    public List<Placement> listAll() {
        return plc.findAll();
    }
     
    public void save(Placement placement) {
    	plc.save(placement);
    }
     
    public Placement get(Integer id) {
        return plc.findById(id).get();
    }
     
    public void delete(Integer id) {
    	plc.deleteById(id);
    }

}
