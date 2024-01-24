package Factory;

import database.DoctorDatabase;
import database.PatientDatabase;
import database.RoomDatabase;

public class HospitalObjectFactory {
    static PatientDatabase patientDatabase=new PatientDatabase();
    static RoomDatabase roomDatabase=new RoomDatabase();
    static DoctorDatabase doctorDatabase=new DoctorDatabase();
    /*public HospitalObjectFactory(){
        patientDatabase=new PatientDatabase();
        doctorDatabase=new DoctorDatabase();
        roomDatabase=new RoomDatabase();
    }*/

    public static PatientDatabase getPatientDatabase() {
        return patientDatabase;
    }

    public static RoomDatabase getRoomDatabase() {
        return roomDatabase;
    }

    public static DoctorDatabase getDoctorDatabase() {
        return doctorDatabase;
    }
}
