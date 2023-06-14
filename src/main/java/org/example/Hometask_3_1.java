package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Hometask_3_1 {
    public static void main(String[] args){
        int length = new Random().nextInt(5, 20);
        ArrayList<Integer> RandomList = fill_array(length);
        printArray(RandomList);
        ArrayList<Integer> RemovingArray = remover_even_number(RandomList);
        printArray(RemovingArray);
//        printArray(RandomList);
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
            if (arrayList.get(i)%2 != 0 && arrayList.get(i) !=0){
                removingList.add(arrayList.get(i));
            }
        }
        return removingList;
    }
    public static void maximal_number(ArrayList<Integer> arrayList){

    }
    public static void minimal_number(ArrayList<Integer> arrayList){

    }
    public static void median_number(ArrayList<Integer> arrayList){

    }
    public static void printArray(ArrayList<Integer> printingArray) {
        printingArray.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
