package org.jembi.encounterservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Obs {

    private  String obsType;

    private  String obsValue;

    private  String obsUnit;

    @JsonIgnore
    private Encounter encounter;

    public String getObsType() {
        return obsType;
    }

    public void setObsType(String obsType) {
        this.obsType = obsType;
    }

    public String getObsValue() {
        return obsValue;
    }

    public void setObsValue(String obsValue) {
        this.obsValue = obsValue;
    }

    public String getObsUnit() {
        return obsUnit;
    }

    public void setObsUnit(String obsUnit) {
        this.obsUnit = obsUnit;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
}
