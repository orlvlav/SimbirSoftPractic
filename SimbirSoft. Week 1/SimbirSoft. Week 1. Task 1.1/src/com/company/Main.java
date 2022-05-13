package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //1.1 Составить программу вывода на экран в одну строку трех любых чисел с двумя пробелами между ними.

        int a = 0 + (int) (Math.random()*10);
        int b = 0 + (int) (Math.random()*10);
        int c = 0 + (int) (Math.random()*10);

        System.out.print(a + "  " + b + "  " + c);
    }
}
