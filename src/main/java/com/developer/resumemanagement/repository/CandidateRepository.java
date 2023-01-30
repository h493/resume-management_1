package com.developer.resumemanagement.repository;

import com.developer.resumemanagement.entity.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CandidateRepository extends JpaRepository<CandidateEntity, Integer> {
    Optional<CandidateEntity> findByName(String name);
}
