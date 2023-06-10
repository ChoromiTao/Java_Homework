package org.example;

import java.util.Arrays;
import java.util.Random;

public class Hometask_1_1 {
    public static void main(String[] args){
        int i = new Random().nextInt(2001);
        System.out.println("случайное сгенерированное число: " + i);
        System.out.println("номер старшего значащего бита этого выпавшего числа: " + older_byte(i));
        int bit_length = older_byte(i);
        System.out.println("Значения, которые кратные n числа в диапазоне от i до Short.MAX_VALUE: ");
        int[] array_max_value = arr_max_value(i, bit_length);
        System.out.println(Arrays.toString(array_max_value));
        System.out.println("Значения, которые все некратные n числа в диапазоне от Short.MIN_VALUE до i: ");
        int[] array_min_value = arr_min_value(i, bit_length);
        System.out.println(Arrays.toString(array_min_value));
    }
    public static int older_byte(int i){
        String a = Integer.toBinaryString(i);
        return a.length();
    }
    public static int[] arr_max_value(int i, int bit_length){
        int arr_length = 0;
        for (int j = i; j < (Short.MAX_VALUE); j++) {
            if (j%bit_length == 0) arr_length ++;
        }
        int[] arr_max_value = new int[arr_length];
        for (int j = i, k = 0; j < (Short.MAX_VALUE); j++) {
            if (j%bit_length == 0){
                arr_max_value[k] = j;
                k++;
            }
        }
        return arr_max_value;
    }

    public static int[] arr_min_value(int i, int bit_length){
        int arr_length = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%bit_length != 0) arr_length ++;
        }
        int[] arr_min_value = new int[arr_length];
        for (int j = Short.MIN_VALUE, k = 0; j < i; j++) {
            if (j% bit_length != 0){
                arr_min_value[k] = j;
                k++;
            }
        }
        return arr_min_value;
    }
}

