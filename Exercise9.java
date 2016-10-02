import java.util.Scanner;
// Created by Игорь Маринич on 02.10.2016.
//Напишите программу перевода градусов из шкалы Цельсия в шкалу фаренгейта (исходную цифру нужно умножить на 9/5 и прибавить 32)
public class Exercise9 {
    public static void main(String[] args) {

        System.out.println("Введите градусы по шкале Цельсия чтоб узнать сколько это по шкале Фаренгейта :");
        Scanner scanner1 = new Scanner(System.in);
        int gr = scanner1.nextInt();
        System.out.println("Результат в градусах по шкале Фаренгейта : " + (gr*9/5+32));
    }
}
