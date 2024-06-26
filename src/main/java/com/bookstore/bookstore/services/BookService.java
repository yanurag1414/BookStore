package com.bookstore.bookstore.services;

import com.bookstore.bookstore.Repository.BookRepository;
import com.bookstore.bookstore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//Service
/* save book
*  get all
*  delete by id
*  update by id
*  get by id
*  sold
*  Add to cart
*  Add to wishList
*  */

@Service
public class BookService {

    private String apiKey = "AIzaSyA4Ehm6dt3GsBNa8WC8AhU_knHgypLHa04";
    private String baseUrl = "https://www.googleapis.com/books/v1/volumes";
    
    @Autowired
    BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    public void deleteBookById(Long id, Book book) {
        bookRepository.deleteById(id);
    }

    public Book updateBookById(Long id, Book book) {
        Book existingBook = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book Not found"));
        existingBook.setId(book.getId());
        existingBook.setName(book.getName());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setIsbn(book.getIsbn());
        existingBook.setPrice(book.getPrice());
        existingBook.setPages(book.getPages());
        return existingBook;
    }

    public Book getById(Long id,Book book){
        return bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book not found"));
    }







}
