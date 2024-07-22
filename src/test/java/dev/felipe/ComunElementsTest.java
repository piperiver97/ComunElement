package dev.felipe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ComunElementsTest {
    @Test
    void testMain() {
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

     
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

       
        assertEquals(expected, elements);
    }
}