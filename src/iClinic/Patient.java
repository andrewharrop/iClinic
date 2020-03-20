package iClinic;

public class Patient {
    private int patientNumber;
    private String name;

    public Patient(int patientNumber, String name){
        this.patientNumber=patientNumber;
        this.name=name;
    }
    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
