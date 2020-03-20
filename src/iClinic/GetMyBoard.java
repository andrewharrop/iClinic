package iClinic;

import java.util.LinkedList;

public class GetMyBoard {
    private User user;
    private LinkedList<Patient> Patients = new LinkedList<>();

    GetMyBoard(User user){
        this.user=user;
    }

    public LinkedList<Patient> getPatients() {
        return Patients;
    }

    public void setPatients(LinkedList<Patient> patients) {
        Patients = patients;
    }
}
