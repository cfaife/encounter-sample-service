package org.jembi.encounterservice.controller;

import org.jembi.encounterservice.model.Encounter;
import org.jembi.encounterservice.model.Obs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/encounters")
public class EncounterController {

    @GetMapping("/{id}")
    public Encounter getEncounter(@PathVariable Long id){
        return  composeObject();
    }

    private Encounter composeObject(){
        Encounter encounter =new Encounter();
        encounter.setEncounterDate(LocalDate.of(2013,10,23));
        encounter.setEncounterType("Physical Examination");
        encounter.setPatient("1");
        encounter.setProvider("1");

        List<Obs> obssrvations = new ArrayList<>();
        Obs obs1 = new Obs();
        obs1.setObsType("Weight");
        obs1.setObsValue("50");
        obs1.setObsUnit("kg");
        obssrvations.add(obs1);

        Obs obs2 = new Obs();
        obs2.setObsType("Height");
        obs2.setObsValue("160");
        obs2.setObsUnit("cm");
        obssrvations.add(obs2);

        Obs obs3 = new Obs();
        obs3.setObsType("Systolic Blood Pressure");
        obs3.setObsValue("120");
        obs3.setObsUnit("mmHg");
        obssrvations.add(obs3);

        Obs obs4 = new Obs();
        obs4.setObsType("Diastolic Blood Pressure");
        obs4.setObsValue("80");
        obs4.setObsUnit("mmHg");
        obssrvations.add(obs4);

        Obs obs5 = new Obs();
        obs5.setObsType("Heartrate");
        obs5.setObsValue("90");
        obs5.setObsUnit("bpm");
        obssrvations.add(obs5);

        Obs obs6 = new Obs();
        obs6.setObsType("Temperature");
        obs6.setObsValue("37");
        obs6.setObsUnit("C");
        obssrvations.add(obs6);

        encounter.setObs(obssrvations);

        return encounter;


    }
}
