package com.geekster.Mapping_Assignment.repository;

import com.geekster.Mapping_Assignment.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {

}
