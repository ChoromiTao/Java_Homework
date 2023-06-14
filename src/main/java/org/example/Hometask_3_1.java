package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Hometask_3_1 {
    public static void main(String[] args){
        int length = new Random().nextInt(5, 20);
        ArrayList<Integer> RandomList = fill_array(length);
        printArray(RandomList);
        ArrayList<Integer> RemovingArray = remover_even_number(RandomList);
        System.out.println("Из полученного массива удалены чётные числа: ");
        printArray(RemovingArray);
        System.out.println("Минимальное значение изначального массива: " + Collections.min(RandomList));
        System.out.println("Максмальное значение изначального массива: " + Collections.max(RandomList));
        int median_number = median_number(RandomList, length);
        System.out.println("Среднее значение минимального и максимального: " + median_number);
        int arithmet_numb = arith_number(RandomList,length);
        System.out.println("Среднее арифметическое от начального массива: " + arithmet_numb);
    }
    public static ArrayList<Integer> fill_array(int length){
        ArrayList<Integer> fillingList = new ArrayList<Integer>(length);
        for (int i = 0; i < length; i++) {
            fillingList.add(new Random().nextInt(30));
        }
        return fillingList;
    }
    public static ArrayList<Integer> remover_even_number(ArrayList<Integer> arrayList){
        int length = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 == 0) length++;
        }
        ArrayList<Integer> removingList = new ArrayList<>(length);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)%2 != 0 && arrayList.get(i) !=0) removingList.add(arrayList.get(i));
        }
        return removingList;
    }
    public static int median_number(ArrayList<Integer> arrayList, int length){
        int median_number = (arrayList.get(0)+arrayList.get(length-1))/2;
        return median_number;
    }
    public static int arith_number(ArrayList<Integer> arrayList, int length){
        int sum_numb = 0;
        for (int i = 0; i < length; i++) sum_numb +=arrayList.get(i);
        sum_numb = sum_numb/length;
        return sum_numb;
    }
    public static void printArray(ArrayList<Integer> printingArray) {
        printingArray.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
