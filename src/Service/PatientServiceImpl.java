package Service;

import Factory.HospitalObjectFactory;
import Models.Doctor;
import Models.Patient;
import Models.Room;
import database.PatientDatabase;

public class PatientServiceImpl implements PatientService{

    PatientDatabase patientDatabase;

    HospitalObjectFactory hospitalObjectFactory;
    public PatientServiceImpl(){

        //we are getting data from factory
        this.patientDatabase=HospitalObjectFactory.getPatientDatabase();//factory
        //this.patientDataBase=patientDataBase
        //getting database from constructor - 2 ways (singleton)
    }
    public Patient getPatientById(String pId){
        //Handling exception
        Patient p= patientDatabase.getPatient(pId);
        try{
            String name=p.getName();
        }
        catch(NullPointerException e){
            System.out.println("Hey patient with this id is not present in DB");
        }
        return p;
    }
    public Doctor getPatientDoctorDetails(String pId){
        return patientDatabase.getPatient(pId).getDoctor();
    }
    public Room getPatientBedDetails(String pId){
        return patientDatabase.getPatient(pId).getRoom();
    }



}
