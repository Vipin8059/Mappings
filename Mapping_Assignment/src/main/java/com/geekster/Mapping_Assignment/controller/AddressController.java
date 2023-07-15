package com.geekster.Mapping_Assignment.controller;

import com.geekster.Mapping_Assignment.model.Address;
import com.geekster.Mapping_Assignment.model.Branch;
import com.geekster.Mapping_Assignment.model.Student;
import com.geekster.Mapping_Assignment.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @GetMapping("addresses")
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @PutMapping("address/{addressId}/{zipcode}")
    public String updateAddressById(@PathVariable Long addressId, @PathVariable String zipcode){
        return addressService.updateAddressById(addressId,zipcode);
    }

    @DeleteMapping("address/{addressId}")
    public String deleteAddressById(@PathVariable Long addressId){
        return addressService.deleteAddressById(addressId);
    }
}
