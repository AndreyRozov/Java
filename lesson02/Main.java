package lesson02;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        System.out.println("Задание 1");

        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        displayArray(array1);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1) {
                array1[i] = 0;
            } else {
                array1[i] = 1;
            }
        }
        System.out.println();
        displayArray(array1);

        System.out.println();

        // Задание 2.

        System.out.println("Задание 2");

        int[] array2 = new int[8];
        for (int j = 0; j < 8; j++) {
            array2[j] = j * 3;
            System.out.print(array2[j] + " ");
        }

        System.out.println();

        // Задание 3.

        System.out.println("Задание 3");

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        displayArray(array3);
        System.out.println();
        for (int k = 0; k < array3.length; k++) {
            if (array3[k] < 6) {
                array3[k] = array3[k] * 2;
            }
            System.out.print(array3[k] + " ");
        }

        System.out.println();

        // Задание 4.

        System.out.println("Задание 4");

        int array4[][] = new int[7][7];
        for (int h = 0; h < array4.length; h++) {
            for (int r = 0; r < array4[h].length; r++) {
                if (h == r || r == array4[h].length - 1 - h) {
                    array4[h][r] = 1;
                }
                System.out.print(array4[h][r] + "  ");
            }

            System.out.println();
        }

        // Задание 5.

        System.out.println("Задание 5");

        int[] array5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -1};
        //находим минимальное значение
        int min = array5[0];
        for (int i = 1; i < array5.length; i++) {
            if (min > array5[i]) {
                min = array5[i];
            }
        }
        //находим максимальное значение
        int max = array5[0];
        for (int i = 1; i < array5.length; i++) {
            if (max < array5[i]) {
                max = array5[i];
            }
        }
        System.out.println("Min " + min);
        System.out.println("Max " + max);

        // Задание 6.

        System.out.println("Задание 6");
        System.out.println(checkBalance());

        // Задание 7.

        System.out.println("Задание 7");
        int[] array7 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        displayArray(array7);
        System.out.println();
        moveArray(array7, 3);
        displayArray(array7);
    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static boolean checkBalance() {
        boolean checkBalance = false;
        int[] mas = {2, 2, 2, 1, 2, 2, 10, 1};
        int sum = 0;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        for (int i = 0; i < mas.length || checkBalance == true; i++) {
            sumLeft += mas[i];
            sumRight = sum - sumLeft;
            if (sumLeft == sumRight) {
                checkBalance = true;
                break;
            }
        }
        return checkBalance;
    }

    public static void moveArray(int[] array, int n) {
        boolean directionForward = false;
        if (n > 0) {
            directionForward = true;
        }
        if (n == 0) {
            System.out.println("Nothing to do");
            return;
        }
        for (int j = 0; j < Math.abs(n); j++) {
            if (directionForward) {
                int temp = array[array.length - 1];
                for (int i = array.length - 2; i >= 0; i--) {
                    array[i + 1] = array[i];
                }
                array[0] = temp;
            } else {
                int temp = array[0];
                for (int i = 1; i < array.length; i++) {
                    array[i - 1] = array[i];
                }
                array[array.length - 1] = temp;
            }
        }
    }
}




