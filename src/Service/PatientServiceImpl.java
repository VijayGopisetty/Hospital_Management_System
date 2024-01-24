package Service;

import Exceptions.DataBaseNotInitializedException;
import Exceptions.IdDoesnotExistException;
import Factory.HospitalObjectFactory;
import Models.Doctor;
import Models.Patient;
import Models.Room;
import database.PatientDatabase;

public class PatientServiceImpl implements PatientService{

    PatientDatabase patientDatabase;

    HospitalObjectFactory hospitalObjectFactory;
    public PatientServiceImpl() throws DataBaseNotInitializedException {

        //we are getting data from factory
       // this.patientDatabase=HospitalObjectFactory.getPatientDatabase();//factory
        this.patientDatabase=null;
        //this.patientDataBase=patientDataBase
        //getting database from constructor - 2 ways (singleton)
        if(this.patientDatabase==null){
            throw new DataBaseNotInitializedException("This database is not present");
        }
    }
    public Patient getPatientById(String pId){
        //Handling exception
        Patient p= patientDatabase.getPatient(pId);
        if(p==null){
            throw new IdDoesnotExistException(String.format("Patient with id %s is not present",pId));
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
