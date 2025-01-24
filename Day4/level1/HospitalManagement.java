import java.util.ArrayList;
import java.util.List;

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}

class Doctor {
    private String name;
    private String specialty;
    private List<Patient> patients;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
        System.out.println("Dr. " + name + " (" + specialty + ") is consulting with " + patient.getName() + ".");
    }
}

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        Doctor doctor1 = new Doctor("John Smith", "Cardiologist");
        Patient patient1 = new Patient("Alice Johnson");

        hospital.addDoctor(doctor1);
        hospital.addPatient(patient1);

        doctor1.consult(patient1);
    }
}