package database;

import Models.Patient;

import java.util.HashMap;

public class PatientDatabase {
    HashMap<String, Patient> patientDB;
    public PatientDatabase(){
        this.patientDB=new HashMap<>();
    }

    public void addPatient(Patient obj){
        String pId=obj.getpId();
        patientDB.put(pId,obj);
    }

    public int TotalPatientCount(){
        return patientDB.size();
    }
    public Patient getPatient(String pId){
        return patientDB.get(pId);
    }

}
