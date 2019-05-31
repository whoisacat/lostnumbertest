package com.whoisacat.lostnumber.test;

import java.util.Date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    public static final int COUNT_OF_TESTS = 100;
    public static final int LENGTH = 99;
    public static final int REPEATS = 5000000;

    @Test
    public void test(){
        long[] mathCalcTime = new long[COUNT_OF_TESTS];

        for (int i = 0; i < COUNT_OF_TESTS; i++) {
            Date start = new Date();
            for (int j = 0; j < REPEATS; j++) {
                int length = LENGTH + 1;
                int without = (int) (Math.random() * length) + 1;
                int[] a = new int[LENGTH];
                for (int k = 0; k < LENGTH; k++) {
                    if (k + 1 != without) {
                        a[k] = k + 1;
                    } else {
                        a[k] = length;
                    }
                }
                assertEquals(without, MathCalc.findOne(a));
            }
            Date end = new Date();
            mathCalcTime[i] = end.getTime() - start.getTime();
        }
        long sum = 0;
        for (long val : mathCalcTime) {
            sum += val;
        }
        mathCalcTime = null;
        long mathAverage = sum / COUNT_OF_TESTS;
        long[] nineCalcTime = new long[COUNT_OF_TESTS];
        for (int i = 0; i < COUNT_OF_TESTS; i++) {
            Date start = new Date();
            for (int j = 0; j < REPEATS; j++) {
                int length = LENGTH + 1;
                int without = (int) (Math.random() * length) + 1;
                int[] a = new int[LENGTH];
                for (int k = 0; k < LENGTH; k++) {
                    if (k + 1 != without) {
                        a[k] = k + 1;
                    } else {
                        a[k] = length;
                    }
                }
                NinetyNine nn = new NinetyNine();
                assertEquals(without, nn.findOneMoreTime(a));
            }
            Date end = new Date();
            nineCalcTime[i] = end.getTime() - start.getTime();
        }
        long sumNN = 0;
        for (long val : nineCalcTime) {
            sumNN += val;
        }
        nineCalcTime = null;
        long nnAverage = sumNN / COUNT_OF_TESTS;
        System.out.println(nnAverage + " ? " + mathAverage);
        assertTrue(nnAverage > mathAverage);
        System.out.println(nnAverage + " > " + mathAverage);
    }
}