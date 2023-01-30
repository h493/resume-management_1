package com.developer.resumemanagement.service;

import com.developer.resumemanagement.entity.CandidateEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


public interface CandidateService {

    Optional<CandidateEntity> findById(int id);
    List<CandidateEntity> findByName(String name);
    List<CandidateEntity> findAllByFirstName(String firstName);
    List<CandidateEntity> findAllByLastName(String lastName);
    CandidateEntity saveCandidate(CandidateEntity candidateEntity);


}
