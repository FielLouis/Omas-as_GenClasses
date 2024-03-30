import Arithmetic.Arithmetic;

import java.util.Scanner;

public class Main {
    static Number num1, num2;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What num type do you want your num1 to be?");
        System.out.println("1 - int ; 2 - long ; 3 - float ; 4 - double");
        System.out.print("Enter choice: ");
        int choice1 = sc.nextInt();

        gettingNum(1, choice1);

        System.out.println("What num type do you want your num2 to be?");
        System.out.println("1 - int ; 2 - long ; 3 - float ; 4 - double");
        System.out.print("Enter choice: ");
        int choice2 = sc.nextInt();

        gettingNum(2, choice2);

        Arithmetic a = new Arithmetic(num1, num2);

        System.out.println("\nAdd: \t\t" + a.add());
        System.out.println("Subtract: \t" + a.subtract());
        System.out.println("Multiply: \t" + a.multiply());
        System.out.println("Divide: \t" + a.divide());
        System.out.println("Min: \t\t" + a.getMin());
        System.out.println("Max: \t\t" + a.getMax());

    }

    public static void gettingNum(int num, int choice1) {
        switch (choice1) {
            case 1 -> {
                System.out.print("Enter int num" + num + ": ");
                if(num == 1) {
                    num1 = sc.nextInt();
                } else {
                    num2 = sc.nextInt();
                }
            }
            case 2 -> {
                System.out.print("Enter long num" + num + ": ");
                if(num == 1) {
                    num1 = sc.nextLong();
                } else {
                    num2 = sc.nextLong();
                }
            }
            case 3 -> {
                System.out.print("Enter float num" + num + ": ");
                if(num == 1) {
                    num1 = sc.nextFloat();
                } else {
                    num2 = sc.nextFloat();
                }
            }
            case 4 -> {
                System.out.print("Enter double num" + num + ": ");
                if(num == 1) {
                    num1 = sc.nextDouble();
                } else {
                    num2 = sc.nextDouble();
                }
            }
            default -> {
            }
        }
    }
}