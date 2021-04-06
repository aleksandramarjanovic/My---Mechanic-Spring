package com.aleksandra.mymechanic.repository;

import com.aleksandra.mymechanic.entity.Mechanic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MechanicRepository extends CrudRepository<Mechanic, Long> {
    List<Mechanic> findAll();

    Mechanic save(Mechanic mechanic);
}
