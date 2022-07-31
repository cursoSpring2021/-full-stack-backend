package com.codewitharjun.fullstackbackend.repository;

import com.codewitharjun.fullstackbackend.modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
