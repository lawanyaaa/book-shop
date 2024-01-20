package com.ijse.bookShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.bookShop.entity.UserEntity;

@Repository

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    
}
