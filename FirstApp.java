public class FirstApp {

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

        System.out.println("Задание 3");
        System.out.println("a * (b + (c / d)) = " + Metod3(3,5,4,9));

            // Задание 4. Выводим результат метода сравнения

        System.out.println("Задание 4");
        System.out.println(Metod4(5, 12));

            // Задание 5. Выводим результат метода положительное/отрицательное

        System.out.println("Задание 5");
        Metod5(15);

            // Задание 6. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

        System.out.println("Задание 6");
        System.out.println(Metod6(10));


            // Задание 7. Метод должен вывести в консоль сообщение «Привет, указанное_имя!»

        System.out.println("Задание 7");
        String name = "Andrey";
        Metod7(name);

            // Задание 8*. Високосный год.

        int a1 = 2020; //указываем год
        int b1, c1, d1;
        b1 = a1 % 4;
        c1 = a1 % 100;
        d1 = a1 % 400;
        if (b1 == 0 && c1 != 0) {
            System.out.println("Високосный год");
        }
        else if (d1 == 0) {
            System.out.println("Високосный год");
        }
        else {
            System.out.println("Обычный год");
        }

    }

    private static float Metod3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }


    private static boolean Metod4(int a, int b) {
        if ( 10 < (a + b) && (a + b) < 20)
            return (true);
        else
            return (false);
    }

    private static int Metod5(int a) {

        if (a >= 0)
            System.out.println("Положительное");
        else
            System.out.println("Отрицательное");
        return a;
    }

    private static boolean Metod6(int b) {
        if ( b < 0)
            return (true);
        else
            return (false);
    }

    private static void Metod7(String name) {
        System.out.printf("Привет, " + name + "!" + "\n");

    }

}