package com.company;

public class Main {

    public static void main(String[] args) {

        String string = "Example string";

        System.out.println(string.length());
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
        int a = 22;
        int b = 10;

        System.out.println("The sum with method is: " + sum(a, b));
        System.out.println("The subtract with method is: " + subtract(a, b));
        System.out.println("The result of multiply is: " + multiply(a, b));
        System.out.println("The result of division is: " + divide(a, b));
        System.out.println("Avg of " + a + "and " + b + "is: " + avg(a, b));

    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static double divide(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }

    public static double avg(double firstNum, double secondNum) {
        return (firstNum + secondNum) / 2;
    }
}
