package com.bridgelabz.testing;
import com.bridgelabz.junit.DatabaseConnection;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class DatabaseConnectionTesting {
    @BeforeEach
    void connect() {
        DatabaseConnection.connect();
    }

    @AfterEach
    void disconnect() {
        DatabaseConnection.disconnect();
    }

    @Test
    void checkConnection() {
        assertTrue(DatabaseConnection.isConnected());
    }

    @Test
    void checkConnectionOff() {
        DatabaseConnection.disconnect();
        assertFalse(DatabaseConnection.isConnected());
    }
}
