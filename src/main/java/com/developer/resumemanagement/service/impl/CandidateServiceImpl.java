package com.developer.resumemanagement.service.impl;

import com.developer.resumemanagement.entity.CandidateEntity;
import com.developer.resumemanagement.repository.CandidateRepository;
import com.developer.resumemanagement.service.CandidateService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateServiceImpl(CandidateRepository candidateRepository){
        this.candidateRepository = candidateRepository;
    }

    @Override
    public List<CandidateEntity> findAllCandidate() {
        return candidateRepository.findAll();
    }

    @Override
    public Optional<CandidateEntity> findById(int id) {
        return candidateRepository.findById(id);
    }

    @Override
    public Optional<CandidateEntity> findByName(String name) {
        return candidateRepository.findByName(name);
    }

    @Override
    public CandidateEntity saveCandidate(CandidateEntity candidateEntity) {
        return candidateRepository.save(candidateEntity);
    }

    @Override
    public CandidateEntity updateCandidate(CandidateEntity candidateEntity) {
        return candidateRepository.save(candidateEntity);
    }
}
