package com.deepanshu.fullstackbackend.repository;

import com.deepanshu.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
