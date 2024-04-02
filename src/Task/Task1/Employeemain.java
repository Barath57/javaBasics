package Task.Task1;

public class Employeemain {
    public static void main(String[] args) {
        Employeedetails details = new Employeedetails(5, 25000, "Barath R", "Developer");
        System.out.println("Employee Id: " + details.getEmpId() + "\nEmployee Name: " + details.getEmpName() + "\nJob Role: " + details.getJobRole() + "\nSalary: " + details.getSalary());
    }
}

