package com.geekster.Mapping_Assignment.repository;

import com.geekster.Mapping_Assignment.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Long> {
}
