package com.bridgelabz.junit.Basic;

public class DatabaseConnection {

    static boolean isConnected;
    public static void connect() {
        isConnected = true;
        System.out.println("Database is connected");
    }
    public static void disconnect() {
        isConnected = false;
        System.out.println("Database is disconnected");
    }

    public static boolean isConnected() {
        return isConnected;
    }
}
