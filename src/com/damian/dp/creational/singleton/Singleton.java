package com.damian.dp.creational.singleton;

public class Singleton {
    private static  Singleton singleton;
    private static  Connection connection;
    private Singleton(){
        connection = new Connection();



    }
    public static  Singleton getInstance(){
     return singleton ==null ?singleton= new Singleton():singleton;


    }
    public static Connection getConnection(){
        return connection;
    }
}
