package com.whoisacat.lostnumber.test;

public class NinetyNine {

    /**
     * Без сортировки
     * @param input
     * @return
     */
    public int findOneMoreTime(int[] input){
        boolean[] tempArr = new boolean[100];
        for(byte i = 0; i < 99; i++){
            tempArr[input[i] - 1] = true;
        }
        for (byte i = 0; i < 99; i++) {
            if (!tempArr[i]) return i + 1;
        }
        return 100;
    }
}
