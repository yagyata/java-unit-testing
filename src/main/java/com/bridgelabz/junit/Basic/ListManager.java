package com.bridgelabz.junit.Basic;

import java.util.List;

public class ListManager {
    public static boolean addElement(List<Integer> list, int element) {
        return list.add(element);
    }

    public static int removeElement(List<Integer> list, int element) {
        if(list.contains(element)) {
            int index = list.indexOf(element);
            return list.remove(index);
        }
        return -1;
    }

    public static int getSize(List<Integer> list) {
        return list.size();
    }
}
