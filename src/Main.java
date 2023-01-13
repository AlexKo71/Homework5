public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Не указана какая операционная система у пользователя");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2011;
        if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Не указана какая операционная система у пользователя");
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Не указана какая операционная система у пользователя");
            }

        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 2023;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("год високосный");
            } else {
                System.out.println("год невисокосный");
            }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 100;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день + срок доставки.");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется два дня + срок доставки.");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется три дня + срок доставки.");
        } else {
            System.out.println("Доставки нет");
        }
    }

        private static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Ошибка ввода");
        }
    }
}