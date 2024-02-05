package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {
    MyArrayList<String> list1 = new MyArrayList<>();



    @Test
    void add() {
        list1.add("Nastya");
        list1.add("Lesha");
        list1.add("Kolya");

        assertEquals(list1.size(), 3);

    }

    @Test
    void addIndex() {
        list1.addIndex("Gena", 0);

        Assertions.assertEquals("Gena", list1.get(0));

    }

    @Test
    void remove() {

        list1.remove(1);

        assertEquals(list1.size(), 0);

    }

    @Test
    void get() {
        list1.add("Nastya");
        list1.get(0);
        Assertions.assertEquals("Nastya", list1.get(0));

    }

    @Test
    void set() {
        list1.add("Nastya");
        list1.set(0, "Nastya");
        Assertions.assertEquals("Nastya", list1.get(0));

    }

    @Test
    void removeFirst() {
        list1.add("Nastya");
        list1.add("Lesha");
        list1.removeFirst();
        assertEquals(list1.size(), 1);

    }

    @Test
    void clear() {
        list1.add("Nastya");
        list1.add("Lesha");
        list1.clear();
        assertEquals(list1.size(), 0);

    }

    @Test
    void testToString() {
        list1.add("Nastya");
        list1.toString();
        assertEquals(list1.size(), 1);

    }
}