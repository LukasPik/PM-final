package com.pik01.pharmaciesmanager.app.worker.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.pik01.pharmaciesmanager.app.pharmacy.model.Pharmacy;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private WorkerRole role;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @ManyToOne
    private Pharmacy workplace;

    public Worker() {
    }

    public Worker(String firstName, String lastName, WorkerRole role, Pharmacy workplace)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.workplace = workplace;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public WorkerRole getRole() {
        return role;
    }

    public void setRole(WorkerRole role) {
        this.role = role;
    }

    public Pharmacy getWorkplace() {
        return workplace;
    }

    public void setWorkplace(Pharmacy workplace) {
        this.workplace = workplace;
    }
}
