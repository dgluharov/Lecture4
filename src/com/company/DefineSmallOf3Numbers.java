package com.company;

import java.util.Scanner;

public class DefineSmallOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(calculatePowerOfNumber(2, 10));
        //System.out.println("The Area of circle is: " + getAreaOfCircle(2));

        /*System.out.println("Please, enter a number");
        int firstNum = scanner.nextInt();
        System.out.println("Please, enter a number");
        int secondNum = scanner.nextInt();
        System.out.println("Please, enter a number");
        int thirdNum = scanner.nextInt();

        System.out.println("The smallest number is: " + getTheSmallestNumber(firstNum, secondNum, thirdNum));
*/


    }

    public static int getTheSmallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < secondNumber) {
            if (firstNumber < thirdNumber) {
                return firstNumber;
            } else {
                return thirdNumber;
            }
        } else {
            if (secondNumber < thirdNumber) {
                return secondNumber;
            }
        }
        return thirdNumber;
    }

    public static double getAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static int calculatePowerOfNumber(int number, int a) {
        if (a != 0) return (number * calculatePowerOfNumber(number, a - 1));
        else return 1;
    }
}
