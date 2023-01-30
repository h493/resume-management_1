package com.developer.resumemanagement.service;

import com.developer.resumemanagement.entity.CandidateEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


public interface CandidateService {
    List<CandidateEntity> findAllCandidate();
    Optional<CandidateEntity> findById(int id);
    Optional<CandidateEntity> findByName(String name);
    CandidateEntity saveCandidate(CandidateEntity candidateEntity);
    CandidateEntity updateCandidate(CandidateEntity candidateEntity);

}
