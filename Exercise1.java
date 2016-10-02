import java.util.Scanner;
//Найти результат умножения чисел “a”, “b” и “c”
// Created by Игорь Маринич on 02.10.2016.
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Для того что-бы умножить числа.Для начала введите число a :");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println("Теперь введите число b :");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        System.out.println("Теперь введите число c :");
        Scanner scanner3 = new Scanner(System.in);
        int c = scanner3.nextInt();
        System.out.println("Вот ваш результат: " + ( a*b*c));
    }
}
