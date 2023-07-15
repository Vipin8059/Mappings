package com.geekster.Mapping_Assignment.controller;

import com.geekster.Mapping_Assignment.model.Book;
import com.geekster.Mapping_Assignment.model.Branch;
import com.geekster.Mapping_Assignment.model.Student;
import com.geekster.Mapping_Assignment.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBook(@RequestBody Book book ){
        return bookService.addBook(book);
    }

    @GetMapping("books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PutMapping("book/{bookId}/{author}")
    public String updateBookById(@PathVariable Long bookId, @PathVariable String author){
        return bookService.updateBookById(bookId,author);
    }

    @DeleteMapping("book/{bookId}")
    public String deleteBookById(@PathVariable Long bookId){
        return bookService.deleteStudentById(bookId);
    }
}
