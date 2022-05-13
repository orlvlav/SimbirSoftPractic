package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        /*1.4 Составить программу, где пользователь будет вводить с клавиатуры 2 числа. Числа будут сравниваться между собой.
        Результат сравнения выводится на экран в виде: “числа равны”, “первое число больше второго”, “первое число меньше второго”*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();

        if (first > second) { System.out.print("Первое число больше второго"); }

        else if (first < second) { System.out.print("Первое число меньше второго"); }

        else { System.out.print("Числа равны"); }

    }
}