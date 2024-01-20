package Models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String docId;
    String docDegree;
    String name;
    long phonenumber;
    String speciality;
    int salary;
    String timeSlot;

    List<Patient> patientList;

    public Doctor(java.lang.String docId, java.lang.String docDegree, java.lang.String name, long phonenumber, java.lang.String speciality, int salary, java.lang.String timeSlot) {
        this.docId = docId;
        this.docDegree = docDegree;
        this.name = name;
        this.phonenumber = phonenumber;
        this.speciality = speciality;
        this.salary = salary;
        this.timeSlot = timeSlot;
        this.patientList=new ArrayList<>();
    }
}
