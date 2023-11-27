package com.example.userregistrationlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userregistrationlogindemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
