package com.developer.resumemanagement.controller;

import com.developer.resumemanagement.entity.CandidateEntity;
import com.developer.resumemanagement.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CandidateController {

    @Autowired
    CandidateService candidateService;

    @GetMapping("/getResumeById/{id}")
    public Optional<CandidateEntity> getResumeById(@PathVariable("id") int id){
        return candidateService.findById(id);
    }
    @GetMapping("/getResumeByName/{name}")
    public List<CandidateEntity> getResumeByName(@PathVariable("name")String name){
       String[] detail = name.split("\\+");
       String firstName = detail[0];
       String lastName = detail[1];

       String candidateName = firstName + " " + lastName;

       List<CandidateEntity> candidates = candidateService.findByName(candidateName);

       if(candidates == null || candidates.size() == 0){
           List<CandidateEntity> firstNameMatch = candidateService.findByLastName(firstName);
           List<CandidateEntity> lastNameMatch = candidateService.findByFirstName(lastName);

           candidates.addAll(firstNameMatch);
           candidates.addAll(lastNameMatch);
       }

       return candidates;
    }

    @PostMapping("/uploadResumeDetails")
    public CandidateEntity uploadResumeDetails(@RequestBody CandidateEntity candidateEntity){
        return candidateService.saveCandidate(candidateEntity);
    }
}
