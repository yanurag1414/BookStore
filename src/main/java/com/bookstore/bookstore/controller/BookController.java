package com.bookstore.bookstore.controller;

import com.bookstore.bookstore.Repository.BookRepository;
import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.services.BookService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;

    @PostMapping(path = "/create")
    public ResponseEntity<Book> createBook(@RequestBody Book book ){
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);
    }

    @GetMapping(path = "/all")
    public List<Book> getAllBook(){
        return bookService.getAllBook();

    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Book> updadeBookById(@PathVariable Long id,@RequestBody Book book){
        return  new ResponseEntity<>(bookService.updateBookById(id,book),HttpStatus.ACCEPTED);
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id,@RequestBody Book book){
            bookService.deleteBookById(id,book);
        return new ResponseEntity<>("deleted Successfully",HttpStatus.OK);
    }

    @GetMapping(path = "/search/{id}")
    public ResponseEntity<Book> searchById(@PathVariable Long id,@RequestBody Book book){
        return new ResponseEntity<>(bookService.getById(id,book),HttpStatus.ACCEPTED);
    }




}
