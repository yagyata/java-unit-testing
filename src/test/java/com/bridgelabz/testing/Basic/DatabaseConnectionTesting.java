package com.bridgelabz.testing.Basic;
import com.bridgelabz.junit.Basic.DatabaseConnection;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class DatabaseConnectionTesting {

    @BeforeEach
    void testConnect() {
        DatabaseConnection.connect();
    }

    @AfterEach
    void testDisconnect() {
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
