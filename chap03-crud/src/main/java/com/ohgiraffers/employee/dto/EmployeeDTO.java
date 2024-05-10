package com.ohgiraffers.employee.dto;

public class EmployeeDTO {
    private String empId;
    private String empName;
    private String phone;
    private String deptCode;
    private String jobCode;
    private int salary;
    private String entYn;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String empId, String empName, String phone, String deptCode, String jobCode, int salary, String entYn) {
        this.empId = empId;
        this.empName = empName;
        this.phone = phone;
        this.deptCode = deptCode;
        this.jobCode = jobCode;
        this.salary = salary;
        this.entYn = entYn;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEntYn() {
        return entYn;
    }

    public void setEntYn(String entYn) {
        this.entYn = entYn;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", phone='" + phone + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salary=" + salary +
                ", entYn='" + entYn + '\'' +
                '}' + "\n";
    }
}