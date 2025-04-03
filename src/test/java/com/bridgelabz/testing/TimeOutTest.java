package com.bridgelabz.testing;

import com.bridgelabz.junit.TimeOut;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeOutTest {

    @Timeout(4)
    @Test
    public void longRunningTaskTest() throws InterruptedException{
        TimeOut.longRunningTask();
    }
}
