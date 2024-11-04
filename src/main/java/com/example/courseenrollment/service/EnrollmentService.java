package com.example.courseenrollment.service;

import com.example.courseenrollment.model.Enrollment;
import com.example.courseenrollment.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment enrollUser(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }
}
