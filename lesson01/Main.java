package lesson01;

import java.util.Scanner;

public class Main {
    // Задание 1. Создаем метод main
    public static void main(String[] args) {
    // Задание 2. Создание переменных всех типов

        byte byte_a;
        short short_b;
        int int_c;
        long long_d;

        float float_e;
        double double_f;

        char char_g;

        boolean boolean_h;

        // Задание 3. Метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
        System.out.println(Metod3());

        // Задание 4. Выводим результат метода сравнения
        System.out.println(Metod4());

        // Задание 5. Выводим результат метода положительное/отрицательное
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in1.nextInt();
        Metod5(a);


        // Задание 6. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        System.out.print("Введите число: ");
        int b = in1.nextInt();
        System.out.println(Metod6(b));


        // Задание 7. Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in2.nextLine();
        Metod7(name);
        
        // Задание 8*. Високосный год.
        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите год:");
        int a1 = in3.nextInt();
        int b1, c1, d1;
        b1 = a1 % 4;
        c1 = a1 % 100;
        d1 = a1 % 400;
        if (b1 == 0 && c1 != 0) {
        	System.out.println("Высокосный год");
        }
        else if (d1 == 0) {
            System.out.println("Высокосный год");
        }
		else {
            System.out.println("Обычный год");
		}

    }

    private static float Metod3() {
        float a = 2.2f, b = 3.2f, c = 4.2f, d = 5.2f;
        float e = a * (b + (c / d));
        return e;
    }

    private static boolean Metod4() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int a = in.nextInt();
        System.out.print("Введите число 2: ");
        int b = in.nextInt();

        if ( 10 < (a + b) && (a + b) < 20)
            return (true);
        else
            return (false);
    }

    private static void Metod5(int a) {

        if (a >= 0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
    }

    private static boolean Metod6(int b) {
        if ( b < 0)
            return (true);
        else
            return (false);
    }

    private static void Metod7(String name) {
            System.out.printf("Привет, %s!", name);

    }

}
