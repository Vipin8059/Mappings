package com.geekster.Mapping_Assignment.repository;

import com.geekster.Mapping_Assignment.model.Address;
import com.geekster.Mapping_Assignment.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Long> {
}
