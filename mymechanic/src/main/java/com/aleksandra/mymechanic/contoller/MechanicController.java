package com.aleksandra.mymechanic.contoller;

import com.aleksandra.mymechanic.entity.Mechanic;
import com.aleksandra.mymechanic.repository.MechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mechanics")

public class MechanicController {

    private MechanicRepository mechanicRepository;

    @Autowired
    public MechanicController(MechanicRepository mechanicRepository) {
        this.mechanicRepository = mechanicRepository;
    }

    @GetMapping
    public List<Mechanic> getAllMechanics() {
        return mechanicRepository.findAll();
    }

    @PostMapping
    public void addMechanic ( @RequestBody Mechanic mechanic){
        mechanicRepository.save(mechanic);
    }
}
