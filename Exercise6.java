import java.util.Scanner;
// Created by Игорь Маринич on 02.10.2016.
//Напишите программу перевода километров в метры
public class Exercise6 {
    public static void main(String[] args) {

        System.out.println("Введите километры чтоб узнать сколько это метров :");
        Scanner scanner1 = new Scanner(System.in);
        int km = scanner1.nextInt();
        System.out.println("Результат в метрах : " + (km*1000));
    }
}