package Service;
import Models.Doctor;
import Models.Patient;
import Models.Room;

public interface PatientService {
    public Patient getPatientById(String pId);
    public Room getPatientBedDetails(String pId);
    public Doctor getPatientDoctorDetails(String pId);

}
