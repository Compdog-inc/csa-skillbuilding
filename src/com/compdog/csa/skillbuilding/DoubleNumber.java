package com.compdog.csa.skillbuilding;

import java.util.Scanner;

public class DoubleNumber {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int num = keyboard.nextInt();
        keyboard.nextLine(); // Apparently this avoids errors or something

        System.out.printf("2 * %d = %d", num, num * 2);
    }

}
