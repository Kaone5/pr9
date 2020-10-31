package ru.mirea.ivashchenko.pr9.INN;

import java.util.HashMap;
import java.util.Scanner;

public class Shop {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<Integer, String> users = new HashMap<Integer, String>();

    private static void createHashMap() {
        users.put(111000, "Ivan");
        users.put(111001, "Alexandr");
        users.put(111002, "Mariya");
        users.put(111003, "Vlada");
    }

    public static void main(String[] args) {
        createHashMap();
        while (scanner.hasNext()) {
            String name = scanner.next();
            int INN = scanner.nextInt();
            try {
                if (validateINN(name, INN))
                    System.out.println("TRUE");
                else
                    System.out.println(name + "'s INN is invalid");
            }
            catch (WrongINNException e) {
                System.out.println(e.toString());
            }
        }
    }

    public static boolean validateINN(String name, int INN) throws WrongINNException{
        if (!users.containsKey(INN))
            throw new WrongINNException("INN from user '" + name + "' is invalid");
        if (users.get(INN).compareTo(name) == 0)
            return true;
        return false;
    }
}
