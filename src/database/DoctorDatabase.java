package database;

import Models.Doctor;

import java.util.HashMap;

public class DoctorDatabase {
    HashMap<String, Doctor> doctorDB;
    DoctorDatabase(){
        doctorDB=new HashMap<>();
    }
}
