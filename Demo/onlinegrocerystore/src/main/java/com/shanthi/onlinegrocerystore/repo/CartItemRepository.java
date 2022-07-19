package com.shanthi.onlinegrocerystore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shanthi.onlinegrocerystore.model.cart.CartItem;
import com.shanthi.onlinegrocerystore.model.cart.CartItemPK;

public interface CartItemRepository extends JpaRepository <CartItem, CartItemPK> {
}
