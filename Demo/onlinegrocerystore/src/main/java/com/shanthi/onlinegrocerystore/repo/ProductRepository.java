package com.shanthi.onlinegrocerystore.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shanthi.onlinegrocerystore.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    void deleteById(Long id);
    Optional<Product> findById (Long id);
}
