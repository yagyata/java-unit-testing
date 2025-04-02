package com.bridgelabz.testing;

import com.bridgelabz.junit.ListOperations;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ListOperationsTesting {

    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        assertTrue(ListOperations.addElement(list, 5));
        assertTrue(ListOperations.addElement(list, 10));

        assertEquals(2, list.size());
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);

        int removedValue = ListOperations.removeElement(list, 5);
        assertEquals(5, removedValue);
        assertEquals(1, list.size());
        assertFalse(list.contains(5));

        int notFound = ListOperations.removeElement(list, 20);
        assertEquals(-1, notFound);
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        assertEquals(3, ListOperations.getSize(list)); // Should return 3
    }
}

