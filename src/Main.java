public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int apple = 1;
        System.out.println("Задача 1");

        int clientIOS = 0;
        int clientAndroid = 1;

        switch (clientIOS) {

            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
        }
        switch (clientAndroid) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");

        int app = 11;
        System.out.println("Задача 1а");

        int clientOS = 1;
        if (clientOS >= 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientOS < 2) {
                System.out.println("Установите версию приложения для Andpoid по ссылке");
            } else {
                System.out.println("XXXXX");
            }
        }

        int addElse = 2;
        System.out.println("Задача 2");

        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015)  {
            System.out.println("Для iOS - установите облегченную версию приложения по ссылке. Для Android - установите облегченную версию приложения по ссылке.");
            if (clientDeviceYear >= 2015) {
                System.out.println("Для iOS - установите версию приложения по ссылке.Для Android - установите версию приложения по ссылке. ");
            } else {
                System.out.println("Not variable");
            }
        }

        float flat = 1.2F;
        System.out.println("Задача 3");

        int year = 2021;
        System.out.println("2021 год не является високосным ");
        switch (year) {
            case 1:
            case 2:
            case 3:
                System.out.println("Не високосный");
                break;
            default:
                System.out.println("2024 год является високосным");
        }

        double cat = 12.22;
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int days;

        if (deliveryDistance <= 20) {
            days = 1;
              System.out.println("Доставка занимает сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
              System.out.println("Доставка занимает двое суток");
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            days = 3;
            System.out.println("Доставка занимает трое суток");
        }

        int age = 18;
        boolean giveCreditCard = age >= 18;
        if (giveCreditCard) {
            System.out.println("Задача 5");
        }

        int monthNumber = 13;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Такого месяца не существует");
        }
        }
    }
}


