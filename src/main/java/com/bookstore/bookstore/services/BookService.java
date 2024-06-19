package com.bookstore.bookstore.services;

import com.bookstore.bookstore.Repository.BookRepository;
import com.bookstore.bookstore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    
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


}
