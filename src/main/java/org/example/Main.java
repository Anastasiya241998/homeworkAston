package org.example;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> list1 = new MyArrayList<>();

        list1.add("Nastya");
        list1.add("Lesha");
        list1.add("Ivan");
        list1.add("Grishaa");
        list1.add("Sem");





        list1.toString();

        list1.addIndex("Gena", 5);
        list1.toString();

        list1.remove(3);
        list1.toString();
        list1.removeFirst();
        list1.toString();

        System.out.printf(list1.get(1));

        list1.clear();
        list1.toString();
















    }
}