package org.example;

import java.util.Arrays;
import java.util.NoSuchElementException;
/**
 * Это реализация списка ArrayLiat
 * Методы данного класса могут  добавлять элемент, добавлять элемент по индексу
 * увеличивать размер массива, доставать и класть элементы, удалять первое вхождение
 * чистить список и выводить все эелементы на экран
 * @author Graceva Anastasiya
 */

public class MyArrayList<T> {
    public static final String MSG = "емкость <= 0";
    /**
     * Количество элементов в массиве
     */
    private int size;
    /**
     * Массив элементов
     */
    private T[] list;
    /**
     * Изначальная длинна массива
     */

    private static final int DEFAULT_CAPACITY = 7;

    /**
     * Проверка емкости массива
     */
    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(MSG); // строки всегда в константах
        }
        list = (T[]) new Object[capacity];
    }
    /**
     * Метод инициализирует массив с размером по умолчанию
     */
    public MyArrayList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];

    }
    /**
     * Метод добавления элемента
     * @param elem элемент
     */
    public void add(T elem) {
        list[size++] = elem;
    }

    /**
     * Метод добавления элемента по индексу
     * @param index индекс элемента в массиве
     * @param elem элемент
     */
    public void addIndex(T elem, int index) {
        сorrectIndex(index);
        if (size == list.length) {
            increasingArray();
        }
        System.arraycopy(list, index, list, index + 1, size - index);
        list[index] = elem;
        size++;
    }
    /**
     * Метод удаления элемента
     * @param index индекс элемента в массиве
     */
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
    }
    /**
     * Метод проверки индекса, мы не должны выходить за поля коллекции
     * @param index индекс
     */
    private void сorrectIndex(int index) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("Индекс не должен быть отрицательным или бвть больше коллекции"); // тоже в константу
        }
    }
    /**
     * Метод увеличения массива в двое
     */

    private void increasingArray() {
        int newCapacity = size * 2;
        list = Arrays.copyOf(list, newCapacity);
    }
    /**
     * Метод получения элемента по индексу
     * @param index индекс желаемого элемента
     */
    public T get(int index) {
        сorrectIndex(index);
        return (T) list[index];
    }
    /**
     * Метод замены элемента
     * @param index индекс элемента
     * @param elem новый элемент
     */
    public void set(int index, T elem) {
        сorrectIndex(index);
        list[index] = elem;
    }
    /**
     * Метод удаления первого вхождения элемента
     */
    public void removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        System.arraycopy(list, 1, list, 0, size - 1);
        size--;
    }
    /**
     * Метод полной отчистки листа, все индексы будут со значением null
     */
    public void clear() {
        Arrays.fill(list, null);
        size = 0;
    }

    /**
     * Метод вывода массива в консоль
     */
    public void print() {
        for (T elem : list) // не забывай про {}
            System.out.print(elem + "  "); // зачем тут printf?
    }

    /**
     * Метод возвращения размера
     * @return размер массива
     */
    public int size() {
        return size;
    }

}

