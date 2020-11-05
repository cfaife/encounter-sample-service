package org.jembi.encounterservice.model;

import java.time.LocalDate;
import java.util.List;

public class Encounter {

    private String encounterType;

    private LocalDate encounterDate;

    private List<Obs> observations;

    private String patient;

    private  String provider;

    public String getEncounterType() {
        return encounterType;
    }

    public void setEncounterType(String encounterType) {
        this.encounterType = encounterType;
    }

    public LocalDate getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(LocalDate encounterDate) {
        this.encounterDate = encounterDate;
    }

    public List<Obs> getObs() {
        return observations;
    }

    public void setObs(List<Obs> observations) {
        this.observations = observations;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
