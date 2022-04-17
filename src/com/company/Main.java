package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        // Задание 1
        int A, B;
        A = scanner.nextInt();
        B = scanner.nextInt();
        if (A > B) {
            System.out.println("A+B = " + (A + B));
        } else if (A == B) {
            System.out.println("A*B = " + A * B);
        } else {
            System.out.print("A-B = " + (A - B));
        }
    }
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        // Задание 2
        int X, Y;
        X = scanner.nextInt();
        Y = scanner.nextInt();

        if (X > 0 & Y > 0) {
            System.out.print("I четверть");
        } else if (X < 0 & Y > 0) {
            System.out.print("II четверть");
        } else if (X < 0 && Y < 0) {
            System.out.print("III четверть");
        } else if (X > 0 && Y < 0) {
            System.out.print("IV четверть");
        } else if (X == 0 && Y != 0) {
            System.out.print("Ось x");
        } else if (Y == 0 && X != 0) {
            System.out.print("Ось y");
        } else {
            System.out.print("Начало координат");
        }
    }
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        // Задание 3
        int A, B, C;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        if (A > B && A > C && B > C) {
            System.out.println("В порядке возрастания:" + C + "," + B + "," + A);
        }
        if (A > B && A > C && B < C) {
            System.out.println("В порядке возрастания:" + B + "," + C + "," + A);
        }
        if (B > A && B > C && A > C) {
            System.out.println("В порядке возрастания:" + C + "," + A + "," + B);
        }
        if (B > A && B > C && A < C) {
            System.out.println("В порядке возрастания:" + A + "," + C + "," + B);
        }
        if (C > A && C > B && A > B) {
            System.out.println("В порядке возрастания:" + B + "," + A + "," + C);
        }
        //if (C>A&&C>B&&A<B)
        else {
            System.out.println("В порядке возрастания:" + A + "," + B + "," + C);
        }
    }
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        // Задание 4
        double A, B, C, D, x1, x2;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();
        D = B * B - 4 * A * C;
        if (D == 0) {
            x1 = -B / 2 * A;
            System.out.print("x1=" + x1);
        } else if (D > 0) {
            x1 = (-B + Math.sqrt(D)) / 2 * A;
            x2 = (-B - Math.sqrt(D)) / 2 * A;
            System.out.print("x1=" + x1 + ",x2=" + x2);
        } else {
            System.out.print("Нет решения");
        }
    }
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        // Задание 5
        int number = scanner.nextInt();
        if ((number > 9) && (number < 20)) {
            switch (number) {
                case 10:
                    System.out.print("ten");
                    break;
                case 11:
                    System.out.print("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if ((number >= 20) && (number < 100)) {
            int value = number / 10;
            switch (value) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }

            int value2 = number % 10;
            switch (value2) {
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" four");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;


            }
        }
    }
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        // Задание 6
        int x0 = scanner.nextInt();
        int y0 = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();
        double length = Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2));
        if (r > length) {
            System.out.println("Попала");
        } else if (r == length) {
            System.out.println("На окружности");
        } else {
            System.out.println("Не попала");
        }
    }
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
    // Задание 7
    //a
    /* int a = scanner.nextInt();
    int a1 = a%10;
    int a2 = a/10%10;
    int a3 = a/100;
    int a4 = (int) Math.pow((a1+a2+a3),3);
    boolean answer;
    if (a == a4){
        answer = true;
    }
    else {
        answer = false;
    }
        System.out.println(answer); */

    //b
        /* int a = scanner.nextInt();
        int a1 = a/1000;
        System.out.println(a1);
        int a2 = a/100%10;
        System.out.println(a2);
        int a3 = a/10%10;
        System.out.println(a3);
        int a4 = a%10;
        System.out.println(a4);
        boolean answer;
        if ((a1+a2) == (a3+a4)){
            answer = true;
        }
        else {
            answer = false;
        }
        System.out.println(answer); */

    // c
        /* int a = scanner.nextInt();
        int a1 = a%10;
        int a2 = a/10%10;
        int a3 = a/100;
        boolean answer;
        if (a1 == a2|| a2 == a3 || a1 == a3){
            answer = true;
        }
        else {
            answer = false;
        }
        System.out.println(answer); */

    // d
        /* double a = scanner.nextDouble();
        int x = (int) (a*1000);
        int a1 = x%10;
        int a2 = x/10%10;
        int a3 = x/100%10;
        System.out.println(x);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        boolean answer;
        if (a1 == 0 || a2 ==0 || a3 == 0){
            answer = true;
        }
        else {
            answer = false;
        }
        System.out.println(answer); */
    }

    }

