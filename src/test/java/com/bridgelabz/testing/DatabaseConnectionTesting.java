package com.bridgelabz.testing;
import com.bridgelabz.junit.DatabaseConnection;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class DatabaseConnectionTesting {

    @BeforeEach
    void connectTest() {
        DatabaseConnection.connect();
    }

    @AfterEach
    void disconnectTest() {
        DatabaseConnection.disconnect();
    }

    @Test
    void checkConnectionTest() {
        assertTrue(DatabaseConnection.isConnected());
    }

    @Test
    void checkConnectionOffTest() {
        DatabaseConnection.disconnect();
        assertFalse(DatabaseConnection.isConnected());
    }
}
