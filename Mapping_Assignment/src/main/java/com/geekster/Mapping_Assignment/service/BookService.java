package com.geekster.Mapping_Assignment.service;

import com.geekster.Mapping_Assignment.model.Book;
import com.geekster.Mapping_Assignment.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book book) {
        bookRepo.save(book);
        return "book added successfully";
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public String updateBookById(Long bookId, String author) {
        Book book = bookRepo.findById(bookId).orElse(null);
        if(book!=null){
            book.setBookAuthor(author);
            return "book updated successfully";
        }
        else{
            return "unable to update book";
        }

    }

    public String deleteStudentById(Long bookId) {
        bookRepo.deleteById(bookId);
        return "book removed successfully";
    }
}
