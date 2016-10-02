import java.util.Scanner;
// Created by Игорь Маринич on 02.10.2016.
//Найти результат выражения:a * a - b % 5 % c
public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Для того что-бы решить уровнение a * a - b % 5 % c.");
        System.out.println("Для начала введите число a :");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println("Теперь введите число b :");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        System.out.println("И на последок введите число c :");
        Scanner scanner3 = new Scanner(System.in);
        int c = scanner3.nextInt();
        System.out.println("Вот ваш результат: " + (a * a - b % 5 % c));
    }
}

