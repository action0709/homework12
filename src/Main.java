import java.time.Year;

public class Main {

    public static void PrintLeapYear (int Year){
        if (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0) {
            System.out.println(Year + "-год является високосным");
        } else {

            System.out.println(Year+"- год не является високосным");
        }
    }
    public static void installApp (int clientOS,int clienDeviceYear){
        if (clientOS == 0) {
            if (clienDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clienDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void  deliveryBankCards (int Distance) {
        int deliveryDays = 1;
        if (Distance > 20 && Distance < 60) {
            deliveryDays++;
            System.out.println("Потребуется дней - " + deliveryDays);
        }
        if (Distance > 60 && Distance < 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней - " + deliveryDays);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        //код задачи 1
        int newYear = 2021;
        PrintLeapYear(newYear);
        System.out.println("Задача 2:");
        //код задачи 2
        int currentYear = 2023;
        int MySystem = 0;
          installApp(MySystem,currentYear);
        System.out.println("Задача 3:");
        //код задачи 3
        int deliveryDistance = 95;
        deliveryBankCards(deliveryDistance);

    }
}