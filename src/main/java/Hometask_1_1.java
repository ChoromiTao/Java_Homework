import java.util.Random;
import java.util.Scanner;

public class Hometask_1_1 {
    public static void main(String[] args){
        int i = new Random().nextInt(2000);
        short[] array_max_value;
        short[] array_min_value;
//        Scanner new_scanner = new Scanner(System.in);
        System.out.println("случайное сгенерированное число: " + i);
        System.out.println("номер старшего значащего бита выпавшего числа: " + older_byte(i));
        System.out.println();

    }
    public static int older_byte(int i){
        String a = Integer.toBinaryString(i);
        int new_length = a.length();
        return new_length;
    }
    public  static short[] arr_max_value(short[] array_max_value){
        return array_max_value;
    }

    public static short[] arr_min_value(short[] array_min_value){
        return array_min_value;
    }
}

