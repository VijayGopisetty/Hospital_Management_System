package Models;

public class Patient {
    String pId;
    String name;
    int age;
    long phonemunber;
    String email;
    String gender;
    String disease;

    Doctor doctor;

    Room room;

    public Patient(java.lang.String pId, java.lang.String name, int age, long phonemunber, java.lang.String email, java.lang.String gender, java.lang.String disease, Doctor doctor, Room room) {
        this.pId = pId;
        this.name = name;
        this.age = age;
        this.phonemunber = phonemunber;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor=doctor;
        this.room=room;
    }
}
