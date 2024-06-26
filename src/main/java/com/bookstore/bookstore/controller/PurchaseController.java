package com.bookstore.bookstore.controller;

import com.bookstore.bookstore.entity.Purchase;
import com.bookstore.bookstore.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping(path = "/buy")
    public Purchase buyBook(@RequestParam Long id, @RequestParam int quantity){
        return purchaseService.buyBook(id,quantity);
    }
}
