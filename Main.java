
import java.util.Scanner;

public class Main

{

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        	System.out.print("Введите год:");

        	int a = in.nextInt();

        	int b, c, d;

        	b = a % 4;

        	c = a % 100;

        	d = a % 400;

        	if (b == 0 && c != 0)
 {
            		System.out.println("Высокосный год");

		}
        	else if (d == 0)
 {
            		System.out.println("Высокосный год");

        	}
		else {

            		System.out.println("Обычный год");

		}
	}

}
