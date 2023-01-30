package com.developer.resumemanagement.service.impl;

import com.developer.resumemanagement.entity.CandidateEntity;
import com.developer.resumemanagement.repository.CandidateRepository;
import com.developer.resumemanagement.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    CandidateRepository candidateRepository;

    @Override
    public Optional<CandidateEntity> findById(int id) {
        return candidateRepository.findById(id);
    }

    @Override
    public List<CandidateEntity> findByName(String name) {
        return candidateRepository.findByName(name);
    }

    @Override
    public List<CandidateEntity> findAllByFirstName(String firstName) {
        return candidateRepository.findAllByFirstName(firstName);
    }

    @Override
    public List<CandidateEntity> findAllByLastName(String lastName) {
        return candidateRepository.findAllByLastName(lastName);
    }

    @Override
    public CandidateEntity saveCandidate(CandidateEntity candidateEntity) {
        return candidateRepository.save(candidateEntity);
    }


}
