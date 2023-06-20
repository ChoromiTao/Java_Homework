package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Testing_code {
        public static void main(String[] args) {
            HashMap<String, ArrayList<String>> contacts = new HashMap<>();
            showMenu();

            Scanner scanner = new Scanner(System.in);

            boolean flag = true;
            while (flag) {
                String input = scanner.nextLine();
                switch (input) {
                    case "0" -> flag = false;
                    case "1" -> showContacts(contacts);
                    case "2" -> addContact(contacts);
                }
            }
        }

        public static void addContact(HashMap<String, ArrayList<String>> contacts) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя:");
            String name = scanner.nextLine();
            System.out.println("Введите телефон:");
            String phone = scanner.nextLine();

            if (contacts.containsKey(name)) {
                ArrayList<String> phones = contacts.get(name);
                phones.add(phone);
            } else {
                ArrayList<String> phones = new ArrayList<String>();
                phones.add(phone);
                contacts.put(name, phones);
            }
        }

        public static void showContacts(HashMap<String, ArrayList<String>> contacts) {
            String[] keys = contacts.keySet().toArray(new String[0]);
            Arrays.sort(keys, (o1, o2) -> contacts.get(o2).size() - contacts.get(o1).size());

            for (var item : contacts.entrySet()) {
                System.out.println(item.getKey() + " - " + item.getValue().toString());
            }
        }

        public static void showMenu() {
            System.out.println("1 - Показать контакты");
            System.out.println("2 - Добавить контакт");
        }
}
