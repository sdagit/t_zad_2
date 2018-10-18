package com.sdacademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here\
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj znak");
        char zn = input.next().charAt(0);
        System.out.print("To jest dodawacz. Podaj 2 liczby rozdzielajc je ENTER");


        int a = input.nextInt();
        int b = input.nextInt();

        System.out.print("WYnik: "+ ((zn == '+')? (a + b) : (a-b)));
    }
}
