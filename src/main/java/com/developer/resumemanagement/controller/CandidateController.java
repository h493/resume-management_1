package com.developer.resumemanagement.controller;

import com.developer.resumemanagement.entity.CandidateEntity;
import com.developer.resumemanagement.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CandidateController {

    private final CandidateService candidateService;
   public CandidateController(CandidateService candidateService){
        this.candidateService = candidateService;
   }

    @GetMapping("/getResumeById/{id}")
    public Optional<CandidateEntity> getResumeById(@PathVariable("id") int id){
        return candidateService.findById(id);
    }
    @GetMapping("/getResumeByName/{name}")
    public Optional<CandidateEntity> getResumeByName(@PathVariable("name")String name){
        return candidateService.findByName(name);
    }

    @PostMapping("/uploadResumeDetails")
    public CandidateEntity uploadResumeDetails(@RequestBody CandidateEntity candidateEntity){
        return candidateService.saveCandidate(candidateEntity);
    }
}
