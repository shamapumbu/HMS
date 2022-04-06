import java.util.*;

class Patient extends User {
    private long patientID, staffID;
    private boolean insured;
    private int yearsOfExperience; //ask Mr Phiri if years of experience for a patient is necessary
    private String description;
    private double salary;
    private HealthInsurancePlan insurancePlan;

    public long getPatientID() {
        return this.patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public long getStaffID() {
        return this.staffID;
    }

    public void setStaffID(long staffID) {
        this.staffID = staffID;
    }

    public boolean getInsured() {
        return this.insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public HealthInsurancePlan getInsurancePlan() {
        return this.insurancePlan;
    }

    public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    public static void main(String[] args) {
        HealthInsurancePlan plan1 = new PlatinumPlan();
        HealthInsurancePlan plan2 = new GoldPlan();
        HealthInsurancePlan plan3 = new SilverPlan();
        HealthInsurancePlan plan4 = new BronzePlan();

        System.out.println("Platinum plan is " + plan1.getCoverage());
        System.out.println("Gold plan is " + plan2.getCoverage());
        System.out.println("Silver plan is " + plan3.getCoverage());
        System.out.println("Bronze plan is " + plan4.getCoverage());
    }
    
}
