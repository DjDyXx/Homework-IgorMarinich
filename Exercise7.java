import java.util.Scanner;
// Created by Игорь Маринич on 02.10.2016.
//Напишите программу перевода килобайтов в байты ( 1 кбайт = 1024 байта)
public class Exercise7 {
    public static void main(String[] args) {

        System.out.println("Введите килобайты чтоб узнать сколько это байтов :");
        Scanner scanner1 = new Scanner(System.in);
        int kb = scanner1.nextInt();
        System.out.println("Результат в байтах : " + (kb*1024));
    }
}
