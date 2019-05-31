package com.whoisacat.lostnumber.test;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MathCalcTest {


    @Test
    public void test(){
        int[] a = {1, 2, 4};
        assertEquals(3,MathCalc.findOne(a));
        a = new int[]{2, 1, 4};
        assertEquals(3,MathCalc.findOne(a));
    a = new int[]{2, 1, 5, 4};
        assertEquals(3,MathCalc.findOne(a));
    }

    @Test
    public void testRandom(){
        for (int i = 0; i < 500000; i++) {
            System.out.println("i = "+ i + " " + new Date().toString());
            int length = (int) (Math.random() * 500000) + 1;
            int without = (int) (Math.random() * length) + 1;
            int[] a = new int[length - 1];

            for (int j = 0; j < length - 1; j++) {
                if (j + 1 != without) {
                    a[j] = j + 1;
                }else{
                    a[j] = length;
                }
            }
            assertEquals(without,MathCalc.findOne(a));
        }
    }
}