package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Hometask_5_1 {
    public static void main(String[] args) {
        HashMap<String[], ArrayList<String>> phonebook_contacts = new HashMap<>();
        showMenu();

        String encoding = System.getProperty("console.encoding", "UTF-8");
        Scanner scanner = new Scanner(System.in, encoding);

        boolean flag = true;
        while (flag) {
            String input = scanner.nextLine();
            switch (input) {
                case "0" -> flag = false;
                case "1" -> showContacts(phonebook_contacts);
                case "2" -> addContact(phonebook_contacts);
            }
        }
    }
    public static void showMenu () {
        System.out.println("0 - Выйти из программы");
        System.out.println("1 - Показать контакты");
        System.out.println("2 - Добавить контакт");
    }
    public static void showContacts(HashMap<String[], ArrayList<String>> contacts) {
        for (var item : contacts.entrySet()) {
            System.out.println(Arrays.toString(item.getKey()) + " - " + item.getValue().toString());
        }
    }
    public static void addContact(HashMap<String[], ArrayList<String>> contacts) {
        String encoding = System.getProperty("console.encoding", "UTF-8");
        Scanner scanner = new Scanner(System.in, encoding);
        String[] human = new String[5];
        ArrayList<String> phones = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (i == 0) System.out.println("Введите фамилию:");
            if (i == 1) System.out.println("Введите имя:");
            if (i == 2) System.out.println("Введите отчество:");
            if (i == 3) System.out.println("Введите дату рождения:");
            if (i == 4) System.out.println("Введите пол:");
            human[i] = scanner.nextLine();
        }
        System.out.println("Введите телефон:");
        String phone = scanner.nextLine();

        if (contacts.containsKey(human)) {
            phones = contacts.get(human);
                phones.add(phone);
            } else {
                phones.add(phone);
                contacts.put(human, phones);
            }
        }
}