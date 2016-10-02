import java.util.Scanner;
// Created by Игорь Маринич on 02.10.2016.
//Напишите программу перевода градусов из шкалы Фаренгейта в шкалу Цельсия (из     исходной цифры нужно вычесть 32 и умножают на 5/9)
public class Exercise8 {
    public static void main(String[] args) {

        System.out.println("Введите градусы по шкале Фаренгейта чтоб узнать сколько это по шкале Цельсия :");
        Scanner scanner1 = new Scanner(System.in);
        double gr = scanner1.nextInt();
        System.out.println("Результат в градусах Цельсия : " + ((gr-32)*5/9));
    }
}
