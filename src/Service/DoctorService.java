package Service;

import Models.Doctor;
import Models.Patient;

import java.util.List;

public interface DoctorService {
    public List<Patient> getAllPatientDetails();
    public Doctor getDoctorDetails(String docId);
    public String curePatient(String docId, String pId);
}
