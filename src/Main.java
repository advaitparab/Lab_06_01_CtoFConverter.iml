

import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        float C, F;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius :");
        C = scan.nextInt();


        if (C == 0) {
            System.out.println("You have reached freezing point");
        } else if (C == 100) {
            System.out.println("You have reached boiling point");
        } else {
            F = C * 9 / 5 + 32;

            System.out.println("Equivalent Temperature in Fahrenheit: " + F);
        }

    }
}