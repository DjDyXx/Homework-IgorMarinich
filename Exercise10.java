import java.util.Scanner;
// Created by Игорь Маринич on 02.10.2016.
//Найдите сумму цифр 3х значного числа без использования циклов (как делали в классе)
public class Exercise10 {
    public static void main(String[] args) {
        System.out.println("Введите любое трёхзначное число :");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        int o1 = n % 10;
        int n1 = n / 10;
        int o2 = n1 % 10;
        int n2 = n1 / 10;
        System.out.println("Вот сумму цифр этого числа: " + (o1+o2+n2));
    }
}
