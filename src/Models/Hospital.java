package Models;

import Exceptions.DataBaseNotInitializedException;
import Factory.HospitalObjectFactory;
import Service.PatientService;
import Service.PatientServiceImpl;
import database.DoctorDatabase;
import database.PatientDatabase;
import database.RoomDatabase;

public class Hospital {
    private String name;
    private String address;
    private long phone_number;
    private String email;

    private PatientDatabase patientDatabase;
    private RoomDatabase roomDatabase;
    private DoctorDatabase doctorDatabase;


    //private HospitalObjectFactory hospitalObjectFactory;


    public Hospital(String name, String address, long phone_number, String email) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
        //this.hospitalObjectFactory=new HospitalObjectFactory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void admitPatient(String name, int age,long phoneNumber,String email,String gender, String disease){
        //1. Generate id for patient
        int totalPatientCount= HospitalObjectFactory.getPatientDatabase().TotalPatientCount();
        String pId="PID"+totalPatientCount+1;

        //2. Get doctor who is handling minimum no of patients
        Doctor doctor=HospitalObjectFactory.getDoctorDatabase().getMinimumPatientDoctor();

        //3. Get empty room
        Room room=HospitalObjectFactory.getRoomDatabase().getUnOccupiedRoom();
        room.setOccupied(true);

        Patient p=new Patient(pId, name, age, phoneNumber, email, gender, disease, doctor, room, true);
        doctor.patientList.add(p);

        System.out.println("Patient got admitted successfully ->"+p);

    }

    public void appointDoctor(String docDegree, String name,long phoneNumber,String speciality, int salary, String timeSlot ){
        String docId ="DOCID"+(HospitalObjectFactory.getDoctorDatabase().getTotalDoctors()+1);
        Doctor doc=new Doctor(docId,docDegree,name,phoneNumber, speciality,salary,timeSlot);
        HospitalObjectFactory.getDoctorDatabase().addDoctorToDataBase(doc);
        System.out.println("Doctor appointed successfully ->"+doc);
    }
    public void createRoom(){
        String roomId="RoomId "+(HospitalObjectFactory.getRoomDatabase().getTotalRooms()+1);
        Room room=new Room(roomId,false,null,null);
        HospitalObjectFactory.getRoomDatabase().addRoomToDB(room);
        System.out.println("Room added successfully ->"+room);
    }

    public void getPatientById(String pId){

        try{
            PatientService ps=new PatientServiceImpl();
        }
        catch(DataBaseNotInitializedException e){
            System.out.println("Database not found exception handled in hospital class");
        }
    }

}
