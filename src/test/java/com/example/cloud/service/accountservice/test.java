package com.example.cloud.service.accountservice;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class test {


    @Test
    public void test(){

        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://ec2-23-23-247-222.compute-1.amazonaws.com:5432/d2a1evfsc8o1ln",
                            "ikedefispysnyc", "d1b653a810c9d7ddb8f8431ae27815d07961e4bd0685d62e7e468116241bf27b");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");

    }
}
