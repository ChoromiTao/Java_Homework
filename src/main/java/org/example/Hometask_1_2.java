package org.example;

import java.util.Random;

public class Hometask_1_2{
    public static void main(String[] args) {
        int i = generateRandomInt();
        int n = calculateHighestBit(i);
        short[] m1 = findMultiplesOfN(i, n);
        short[] m2 = findNonMultiplesOfN(i, n);

        System.out.println("Generated random integer: " + i);
        System.out.println("Number of highest bit: " + n);
        System.out.println("Multiples of " + n + " from " + i + " to " + Short.MAX_VALUE + ":");
        printArray(m1);
        System.out.println("Non-multiples of " + n + " from " + Short.MIN_VALUE + " to " + i + ":");
        printArray(m2);
    }

    private static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(2001);
    }

    private static int calculateHighestBit(int number) {
        String a = Integer.toBinaryString(number);
        return a.length();
    }

    private static short[] findMultiplesOfN(int start, int n) {
        int count = 0;
        for (int i = start; i <= Short.MAX_VALUE; i++) {
            if (i % (1 << (n - 1)) == 0) {
                count++;
            }
        }
        short[] result = new short[count];
        int index = 0;
        for (int i = start; i <= Short.MAX_VALUE; i++) {
            if (i % (1 << (n - 1)) == 0) {
                result[index] = (short) i;
                index++;
            }
        }
        return result;
    }

    private static short[] findNonMultiplesOfN(int end, int n) {
        int count = 0;
        for (int i = Short.MIN_VALUE; i <= end; i++) {
            if (i % (1 << (n - 1)) != 0) {
                count++;
            }
        }
        short[] result = new short[count];
        int index = 0;
        for (int i = Short.MIN_VALUE; i <= end; i++) {
            if (i % (1 << (n - 1)) != 0) {
                result[index] = (short) i;
                index++;
            }
        }
        return result;
    }

    private static void printArray(short[] array) {
        for (short element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}