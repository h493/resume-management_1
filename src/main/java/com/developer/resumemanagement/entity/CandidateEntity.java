package com.developer.resumemanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "resume_candidate")
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "candidate_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name ="first_name")
    private String firstName;

    @Column(name ="last_name")
    private String lastName;

    @Column(name = "job_company")
    private String jobCompany;

    public CandidateEntity() {

    }

    public CandidateEntity(int id, String name, String jobTitle, String jobDescription, String jobCompany) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobCompany = jobCompany;

        this.firstName = name.substring(0, name.indexOf(' '));
        this.lastName = name.substring(name.indexOf(' ')+1);
       // System.out.println(name + "******" + lastName + "*****" + firstName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String candidateName) {
        this.name = candidateName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobCompany() {
        return jobCompany;
    }

    public void setJobCompany(String jobCompany) {
        this.jobCompany = jobCompany;
    }

}
