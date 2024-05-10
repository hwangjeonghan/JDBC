package com.ohgiraffers.employee.dto;

public class EmpInsertDTO {

    private String empId;
    private String empName;
    private String empNo;
    private String jobCode;
    private String salLevel;

    public EmpInsertDTO() {
        this.empId = empId;
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

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        if(jobCode.equals("대표")){
            this.jobCode = "J1";
        } else if (jobCode.equals("부사장")) {
            this.jobCode = "J2";
        }else if (jobCode.equals("부장")) {
            this.jobCode = "J3";
        }else if (jobCode.equals("차장")) {
            this.jobCode = "J4";
        }else if (jobCode.equals("과장")) {
            this.jobCode = "J5";
        }else if (jobCode.equals("대리")) {
            this.jobCode = "J6";
        }else if (jobCode.equals("사원")) {
            this.jobCode = "J7";
        }
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    @Override
    public String toString() {
        return "EmpInsertDTO{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                '}';
    }
}
