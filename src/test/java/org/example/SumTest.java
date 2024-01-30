package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    public void testAddingTwoNum(){
        Sum cal = new Sum();
        assertEquals(8, cal.add(3,5));

    }
    @Test
    public void testAddingTwoNumWrong(){
        Sum cal = new Sum();
        assertEquals(4, cal.add(5,3));
    }


}