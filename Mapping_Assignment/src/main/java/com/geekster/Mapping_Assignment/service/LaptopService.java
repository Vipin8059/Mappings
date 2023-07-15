package com.geekster.Mapping_Assignment.service;

import com.geekster.Mapping_Assignment.model.Laptop;
import com.geekster.Mapping_Assignment.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;
    public String addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
        return "laptop added successfully";
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public String updateLaptopById(Long laptopId, String brand) {
        Laptop laptop = laptopRepo.findById(laptopId).orElse(null);
        if(laptop!=null){
            laptop.setLaptopBrand(brand);
            return "laptop added successfully";
        }
        return "unable to update laptop";
    }

    public String deleteLaptopById(Long laptopId) {
        laptopRepo.deleteById(laptopId);
        return "laptop removed  successfully";
    }
}
