package Models;

public class Patient {
    String pId;
    String name;
    int age;
    long phoneNumber;

    public String getpId() {
        return pId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Room getRoom() {
        return room;
    }

    String email;
    String gender;
    String disease;

    Doctor doctor;

    Room room;

    public Patient(java.lang.String pId, java.lang.String name, int age, long phoneNumber, java.lang.String email, java.lang.String gender, java.lang.String disease, Doctor doctor, Room room) {
        this.pId = pId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor=doctor;
        this.room=room;
    }
}
