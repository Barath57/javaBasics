package Task.Task1;

public class Employeedetails {
    Integer empId, salary;
    String empName, jobRole;
    public Employeedetails(Integer empId, Integer salary, String empName, String jobRole) {
        this.empId = empId;
        this.salary = salary;
        this.empName = empName;
        this.jobRole = jobRole;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
    
    public String getJobRole() {
        return jobRole;
    }

    public Integer getSalary() {
        return salary;
    }
}

