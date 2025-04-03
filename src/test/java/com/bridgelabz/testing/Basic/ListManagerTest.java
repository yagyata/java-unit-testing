package com.bridgelabz.testing.Basic;

import com.bridgelabz.junit.Basic.ListManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    static List<Integer> list;
    @BeforeAll
    static void setUp() {
        list = new ArrayList<>();
        ListManager.addElement(list,10);
        ListManager.addElement(list,12);
    }

    @Test
    public void shouldAddElementToTheList() {
//        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();
        assertTrue(ListManager.addElement(list,5));

        assertEquals(1,list.size());
        assertTrue(list.contains(5));
    }

    @Test
    public void shouldRemoveElementFromTheList() {
        List<Integer> list = new ArrayList<>();
        int removedValue = ListManager.removeElement(list, 10);
        assertFalse(list.contains(10));

        int notFound = ListManager.removeElement(list, 20);
        assertEquals(-1, notFound);
    }

    @Test
    public void shouldGetSizeOfTheList() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        assertEquals(3, ListManager.getSize(list));
    }
}

