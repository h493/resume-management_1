package com.developer.resumemanagement.service;

import com.developer.resumemanagement.entity.CandidateEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


public interface CandidateService {

    Optional<CandidateEntity> findById(int id);
    List<CandidateEntity> findByName(String name);
    List<CandidateEntity> findByFirstName(String firstName);
    List<CandidateEntity> findByLastName(String lastName);
    CandidateEntity saveCandidate(CandidateEntity candidateEntity);


}
