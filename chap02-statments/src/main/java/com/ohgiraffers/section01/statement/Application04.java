package com.ohgiraffers.section01.statement;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.*;
public class Application04 {

    public static void main(String[] args){
        Connection con = getConnection();

        Statement stmt = null;
        ResultSet rest = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사번을 입력해주세요 : ");
        int empId = sc.nextInt();
        String query  = "SELECT * FROM EMPLOYEE WHERE EMP_ID = " + empId;
        EmployeeDTO employeeDTO = null;
        try {
            stmt = con.createStatement();
            rest = stmt.executeQuery(query);

            if(rest.next()){
                employeeDTO = new EmployeeDTO();
                employeeDTO.setEmpId(rest.getString("EMP_ID"));
                employeeDTO.setEmpName(rest.getString("EMP_NAME"));
                employeeDTO.setEmpNo(rest.getString("EMP_NO"));
                employeeDTO.setEmail(rest.getString("EMAIL"));
                employeeDTO.setPhone(rest.getString("PHONE"));
                employeeDTO.setDeptCode(rest.getString("DEPT_CODE"));
                employeeDTO.setJobCode(rest.getString("JOB_CODE"));
                employeeDTO.setSalLevel(rest.getString("SAL_LEVEL"));
                employeeDTO.setSalary(rest.getInt("SALARY"));
                employeeDTO.setBonus(rest.getDouble("BONUS"));
                employeeDTO.setManagerId(rest.getString("MANAGER_ID"));
                employeeDTO.setHireDate(rest.getDate("HIRE_DATE"));
                employeeDTO.setEntDate(rest.getDate("ENT_DATE"));
                employeeDTO.setEntYn(rest.getString("ENT_YN"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rest);
            close(stmt);
            close(con);
        }

        System.out.println("select emp : " + employeeDTO);
    }
}