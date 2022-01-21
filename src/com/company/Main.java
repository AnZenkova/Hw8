package com.company;

import java.time.LocalDate;

public class Main {

    public static void checkYearForLeap(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void operatingSystemDefinition (int system, int year){
        if (system == 0 && year >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (system == 0 && year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (system != 0 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int deliveryDaysCount (int distance) {
            if (distance < 20) {
                return 1;
            } else if (distance >= 20 && distance < 60) {
                return 2;
            } else {
                return 3;
            }
    }

    public static void checkForDuplicates (String line) {
        char[] arr = line.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            if (arr[i] == arr[j]) {
                System.out.println("В строке присутствует дубль " + arr[j]);
                return;
            } else if (j == arr.length) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int year = 2000;
        checkYearForLeap(year);

        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        operatingSystemDefinition(clientOS, clientDeviceYear);

        int deliveryDistance = 95;
        System.out.println(deliveryDaysCount(deliveryDistance) + 1);

        String line = "aabccddefgghiijjkk";
        checkForDuplicates(line);
    }
}
