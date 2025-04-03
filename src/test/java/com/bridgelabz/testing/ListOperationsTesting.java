package com.bridgelabz.testing;

import com.bridgelabz.junit.ListOperations;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.*;
import static org.junit.Assert.*;

public class ListOperationsTesting {

    static List<Integer> list;
    @BeforeAll
    public void setList() {
        list = new ArrayList<>();
        ListOperations.addElement(list,10);
        ListOperations.addElement(list,12);
    }

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

        int removedValue = ListOperations.removeElement(list, 12);
        assertFalse(list.contains(12));

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

