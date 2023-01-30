package com.developer.resumemanagement.repository;

import com.developer.resumemanagement.entity.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateRepository extends JpaRepository<CandidateEntity, Integer> {
    List<CandidateEntity> findByName(String name);
    List<CandidateEntity> findAllByFirstName(String name);
    List<CandidateEntity> findAllByLastName(String name);
}
