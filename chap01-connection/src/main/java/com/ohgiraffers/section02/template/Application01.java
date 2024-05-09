package com.ohgiraffers.section02.template;

import java.sql.Connection;

public class Application01 {
    public static void main(String[] args) {
        Connection con = JDBCTemplate.getConnection();
        System.out.println("con = " + con);

        JDBCTemplate.close(con);
        System.out.println("con = " + con);

    }
}
