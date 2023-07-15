package com.geekster.Mapping_Assignment.service;

import com.geekster.Mapping_Assignment.model.Address;
import com.geekster.Mapping_Assignment.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "address added successfully";
    }

    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    public String updateAddressById(Long addressId, String zipcode) {
        Address address = addressRepo.findById(addressId).orElse(null);
        if(address!=null){
            address.setZipcode(zipcode);
            return "address updated successfully";
        }
        return "unable to update address";
    }

    public String deleteAddressById(Long addressId) {
        addressRepo.deleteById(addressId);
        return "address removed successfully";
    }
}
