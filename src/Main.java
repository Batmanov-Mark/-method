import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        isYearLeap(2020);

        System.out.println("Task 2");
        checkApplicationVersion( 1,2021);

        System.out.println("Task 3");
        int deliveryDistance = calculateDeliveryTime(95);
                System.out.println(" Потребуется дней: " + deliveryDistance);
    }

    // Task 1;
    public static void isYearLeap(int year) {
        if (year < 1584) {
        System.out.println(year + "  год не является високосным");
    } else {
        if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
            System.out.println(year + "  год является високосным");
        } else {
            System.out.println(year + "  год не является високосным");
        }
      }
    }
    // Task 2;
    public static void checkApplicationVersion(int os, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (os == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите  обычную версию приложения для iOS по ссылке");
        } else if (os == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите  облегченную версию приложения для iOS по ссылке");
        }
        if (os == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите  обычную версию приложения для Android по ссылке");
        } else if (os == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите  облегченную версию приложения для Android по ссылке");
        }
    }

// Task 3;
public static int calculateDeliveryTime(int deliveryDistance) {
    int deliveryTime;
    if (deliveryDistance > 100) {
        deliveryTime = -1;
    } else if (deliveryDistance <= 20) {
        deliveryTime = 1;
    } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
        deliveryTime = 2;
    } else {
        deliveryTime = 3;
    }
    return deliveryTime;
}
}


