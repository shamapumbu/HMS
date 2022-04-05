import java.util.*;

class Doctor extends Staff {
    private long doctorID;
    private String specialization;

    public long getDoctorID() {
        return this.doctorID;
    }

    public void setDoctorID(long doctorID) {
        this.doctorID = doctorID;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

