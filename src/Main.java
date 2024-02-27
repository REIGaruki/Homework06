public class Main {
    public static void main(String[] args) {
        int taskNumber = 0;
        taskNumber = taskNumber + 1;
        System.out.println("Задача " + taskNumber);
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(i + " ");
        }
        taskNumber = taskNumber + 1;
        System.out.println("\nЗадача " + taskNumber);
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(11 - i + " ");
        }
        taskNumber = taskNumber + 1;
        System.out.println("\nЗадача " + taskNumber);
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ");
        }
        taskNumber = taskNumber + 1;
        System.out.println("\nЗадача " + taskNumber);
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.print(i + " ");
        }
        taskNumber = taskNumber + 1;
        System.out.println("\nЗадача " + taskNumber);
        for (int i = 1904; i < 2100; i = i + 4) {
            System.out.println(i + "-й год является високосным");
        }
        taskNumber = taskNumber + 1;
        System.out.println("Задача " + taskNumber);
        for (int i = 7; i < 100; i = i + 7) {
            System.out.print(i + " ");
        }
        taskNumber = taskNumber + 1;
        System.out.println("\nЗадача " + taskNumber);
        for (int i = 1; i < 1024; i = i * 2) {
            System.out.print(i + " ");
        }
        taskNumber = taskNumber + 1;
        System.out.println("\nЗадача " + taskNumber);
        float deposit = 0f;
        for (int month = 1; month <= 12; month = month + 1) {
            deposit = deposit + 29_000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
        taskNumber = taskNumber + 1;
        System.out.println("\nЗадача " + taskNumber);
        deposit = 0;
        for (int month = 1; month <= 12; month = month + 1) {
            deposit = (deposit * 110 / 100 + 29_000);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
        taskNumber = taskNumber + 1;
        System.out.println("\nЗадача " + taskNumber);
        int a, b;
        for (a = 2; a <= 9; a = a + 1) {
            System.out.println("Таблица цмножения на " + a);
            for ( b= 1; b <= 10; b = b + 1) {
                System.out.println(a + " * " + b + " = " + a * b);
            }
        }
    }
}