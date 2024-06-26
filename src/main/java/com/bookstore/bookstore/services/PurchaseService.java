package com.bookstore.bookstore.services;

import com.bookstore.bookstore.Repository.BookRepository;
import com.bookstore.bookstore.Repository.PurchaseRepository;
import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.entity.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PurchaseService {

    @Autowired
    private  PurchaseRepository purchaseRepository;


    @Autowired
    private  BookRepository bookRepository;

    public Purchase buyBook(Long id,int quantity){
        Book book = bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book not found"));
        if(book.getStock()<quantity){
           throw new RuntimeException("Book not available");
        }
        book.setStock(book.getStock()-quantity);
        bookRepository.save(book);

        Purchase purchase = new Purchase();
        purchase.setBook(book);
        purchase.setQuantity(quantity);
        purchase.setTotalPrice(book.getPrice()*quantity);
        purchase.setPurchaseDate(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

//    public Cart AddToCart(Book book){
//
//    }

}
