import java.util.*;

class Staff extends User {
    private long staffID, salary; //ask Mr Phiri why staffID isn't in user class since two of it's child classes have it.
    private int yearsOfExperience;
    private String description;

    public long getStaffID() {
        return this.staffID;
    }
    
    public void setStaffID(long staffID) {
        this.staffID = staffID;
    }

    public long getSalary() {
        return this.salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
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

}