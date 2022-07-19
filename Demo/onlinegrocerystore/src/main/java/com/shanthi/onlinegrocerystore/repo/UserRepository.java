package com.shanthi.onlinegrocerystore.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shanthi.onlinegrocerystore.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteById(Long id);

    User findByUsername (String username);
    Optional<User> findById (Long id);
}
