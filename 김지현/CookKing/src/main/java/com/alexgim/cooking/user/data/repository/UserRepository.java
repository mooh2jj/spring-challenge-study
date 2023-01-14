package com.alexgim.cooking.user.data.repository;

import com.alexgim.cooking.user.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
