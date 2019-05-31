package com.whoisacat.lostnumber.test;

public class MathCalc {

    public static int findOne(int[] input) {
        int length = input.length + 1;
        int sum = length + ((int)((length - 1) / 2 * length)) + (length % 2 == 0 ? length / 2 : 0);
        return sum - sum(input);
    }

    private static int sum(int[] input) {
        int sum = 0;
        for (int val : input) {
            sum += val;
        }
        return sum;
    }
}
