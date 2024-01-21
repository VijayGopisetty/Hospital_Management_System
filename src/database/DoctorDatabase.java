package database;

import Models.Doctor;
import Models.Patient;

import java.util.HashMap;
import java.util.List;

public class DoctorDatabase {
    HashMap<String, Doctor> doctorDataBase;
    public DoctorDatabase(){
        doctorDataBase=new HashMap<>();
    }
    public Doctor getMinimumPatientDoctor(){
        Doctor miniDoc=null;
        int min=Integer.MAX_VALUE;
        for(String key:doctorDataBase.keySet()){
            Doctor doc=doctorDataBase.get(key);
            List<Patient> patientList=doc.getPatientList();
            if(patientList.size()<min){
                miniDoc=doc;
                min= patientList.size();

            }
        }
        return miniDoc;
    }

    public int getTotalDoctors(){
        return doctorDataBase.size();
    }

    public Doctor getDoctorID(String id){
        return doctorDataBase.get(id);
    }

    public void addDoctorToDataBase(Doctor doctor){
        String docId=doctor.getDocId();
        doctorDataBase.put(docId,doctor);
    }
}
