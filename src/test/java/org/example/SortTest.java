package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortTest {

    @Test
    void sort() {
        MyArrayList<Integer> list = new MyArrayList<>();


        list.add(1);
        list.add(4);
        list.add(3);
        Sort.quickSort(list);

        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
        assertEquals(4, list.get(2));


    }
}