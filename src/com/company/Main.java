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

    public static void main(String[] args) {
        int year = 2000;
        checkYearForLeap(year);

        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        operatingSystemDefinition(clientOS, clientDeviceYear);
    }
}
