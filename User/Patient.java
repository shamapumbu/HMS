import java.util.*;

class Patient extends User {
    private long patientID, staffID;
    private boolean insured;
    private int yearsOfExperience;
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
        HealthInsurancePlan plan1 = new PlatinumPlan(0.9);
        HealthInsurancePlan plan2 = new GoldPlan(0.8);
        HealthInsurancePlan plan3 = new SilverPlan(0.7);
        HealthInsurancePlan plan4 = new BronzePlan(0.6);

        System.out.println("Platinum Plan is " + plan1);
        System.out.println("Gold Plan is " + plan2);
        System.out.println("Silver Plan is " + plan3);
        System.out.println("Bronze Plan is " + plan4);
    }
}