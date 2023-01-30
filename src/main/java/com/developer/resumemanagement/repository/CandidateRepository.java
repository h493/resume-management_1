package com.developer.resumemanagement.repository;

import com.developer.resumemanagement.entity.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CandidateRepository extends JpaRepository<CandidateEntity, Integer> {
    List<CandidateEntity> findByName(String name);
    List<CandidateEntity> findByFirstName(String name);
    List<CandidateEntity> findByLastName(String name);
}
