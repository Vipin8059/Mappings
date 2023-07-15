package com.geekster.Mapping_Assignment.controller;

import com.geekster.Mapping_Assignment.model.Branch;
import com.geekster.Mapping_Assignment.model.Laptop;
import com.geekster.Mapping_Assignment.model.Student;
import com.geekster.Mapping_Assignment.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop laptop ){
        return laptopService.addLaptop(laptop);
    }

    @GetMapping("laptops")
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }

    @PutMapping("laptop/{laptopId}/{brand}")
    public String updateLaptopById(@PathVariable Long laptopId, @PathVariable String brand){
        return laptopService.updateLaptopById(laptopId,brand);
    }

    @DeleteMapping("laptop/{laptopId}")
    public String deleteLaptopById(@PathVariable Long laptopId){
        return laptopService.deleteLaptopById(laptopId);
    }
}
