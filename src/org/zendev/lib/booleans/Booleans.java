package org.zendev.lib.booleans;

public class Booleans {

    public static int booleanToNumber(boolean flag) {
        return flag ? 1 : 0;
    }

    public static int[] booleansToNumbers(boolean... array) {
        int[] numbers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numbers[i] = array[i] ? 1 : 0;
        }

        return numbers;
    }
}