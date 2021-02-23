package lesson03;

import java.util.Random;
import java.util.Scanner;

public class homeWork01 {
    public static Scanner sc = new Scanner(System.in);
    public static Scanner retrySc = new Scanner(System.in);

    public static void main(String[] args) {
        int retry = 1;
        while (retry == 1) {
            Random rand = new Random();
            int randNum = rand.nextInt(9);
            for (int i = 0; i < 3; i++) {
                int getNum = getNumber("Введите число от 0 до 9", 0, 9);
                if (getNum > randNum) {
                    System.out.println("Загаданное число меньше");
                } else if (getNum < randNum) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Угадал");
                    break;
                }
            }
            System.out.println(randNum);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            retry = retrySc.nextInt();
        }
    }

    public static int getNumber(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
}
