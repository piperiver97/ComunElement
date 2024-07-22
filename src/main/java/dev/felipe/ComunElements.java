package dev.felipe;


import java.util.ArrayList;

public class ComunElements {
    public static void main(String[]Args){

    ArrayList<Integer> elements = new ArrayList<Integer>();
    elements.add(1);
    elements.add(2);
    elements.add(3);
    elements.add(4);
    elements.add(5);
    elements.add(6);

    ArrayList<Integer> elements2 = new ArrayList<Integer>();
    elements2.add(1);
    elements2.add(2);
    elements2.add(3);

    elements.retainAll(elements2);
    System.out.println(elements);
}
}