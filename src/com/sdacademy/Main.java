package com.sdacademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("To jest dodawacz. Podaj 2 liczby rozdzielajc je ENTER");

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.print("WYnik: "+ (a + b));
    }
}
