package oop;

public class Developer extends Employee{
    String projectName;



    public Developer() {
    }

   
    public Developer(String name, String emailAddress, String phone, String departement, String address, int yearOfBirth, String projectName) {
       super(name ,emailAddress, phone,departement,address,yearOfBirth);
       this.projectName = projectName;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}
