package com.bookstore.bookstore.Repository;

import com.bookstore.bookstore.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository< Purchase,Long> {

}
