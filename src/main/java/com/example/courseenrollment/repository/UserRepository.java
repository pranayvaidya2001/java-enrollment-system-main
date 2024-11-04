package com.example.courseenrollment.repository;

import com.example.courseenrollment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
