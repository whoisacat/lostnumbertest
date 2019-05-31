package com.whoisacat.lostnumber.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NinetyNineTest {

    @Test
    void findOne() {

        int[] a = {
                1,   2,  3,  4,  5,  6,  7,  8,  9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84,     86, 87, 88, 89, 90,
                91, 92, 93, 94, 85, 96, 97, 98, 99,100
        };
        assertEquals(99,a.length);
        NinetyNine ninetyNine = new NinetyNine();
        assertEquals(95,ninetyNine.findOneMoreTime(a));
        assertEquals(95,MathCalc.findOne(a));
        int[] b = {
                1,   2,  3,  4,  5,  6,  7,  8,  9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77,     79, 80,
                81, 82, 83, 84, 85, 86, 87, 78, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99,100
        };
        assertEquals(88,ninetyNine.findOneMoreTime(b));
        assertEquals(88,MathCalc.findOne(b));
        int[] c = {
                1,   2,  3,  4,  5,  6,  7,  8,  9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94,     96, 97, 98, 99, 95
        };
        assertEquals(100,ninetyNine.findOneMoreTime(c));
        assertEquals(100,MathCalc.findOne(c));
        int[] d = {
                1,   2,  3,  4,  5,  6,  7,  8,  9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88,     90,
                91, 92, 93, 94, 95, 96, 97, 98, 89,100
        };
        assertEquals(99,ninetyNine.findOneMoreTime(d));
        assertEquals(99,MathCalc.findOne(d));
    }
}