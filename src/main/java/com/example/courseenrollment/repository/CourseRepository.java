package com.example.courseenrollment.repository;

import com.example.courseenrollment.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
