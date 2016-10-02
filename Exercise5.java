import java.util.Scanner;
// Created by Игорь Маринич on 02.10.2016.
//Напишите программу перевода метров в километры
public class Exercise5 {
    public static void main(String[] args) {

        System.out.println("Введите метры чтоб узнать сколько это километров :");
        Scanner scanner1 = new Scanner(System.in);
        int metr = scanner1.nextInt();
        System.out.println("Результат в километрах : " + (metr * 0.001));
    }
}

