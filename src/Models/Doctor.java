package Models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String docId;
    String docDegree;
    String name;
    long phoneNumber;
    String speciality;
    int salary;
    String timeSlot;

    List<Patient> patientList;

    public Doctor(java.lang.String docId, java.lang.String docDegree, java.lang.String name, long phoneNumber, java.lang.String speciality, int salary, java.lang.String timeSlot) {
        this.docId = docId;
        this.docDegree = docDegree;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.salary = salary;
        this.timeSlot = timeSlot;
        this.patientList=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "docId='" + docId + '\'' +
                ", docDegree='" + docDegree + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", speciality='" + speciality + '\'' +
                ", salary=" + salary +
                ", timeSlot='" + timeSlot + '\'' +
                '}';
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocDegree() {
        return docDegree;
    }

    public void setDocDegree(String docDegree) {
        this.docDegree = docDegree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
