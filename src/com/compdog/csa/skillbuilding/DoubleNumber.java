// Vlad, 9/11/2024, Program that prompts an integer and displays the entered value *2

package com.compdog.csa.skillbuilding;

import java.util.Scanner;

public class DoubleNumber {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int num = keyboard.nextInt();
        keyboard.nextLine(); // Apparently this avoids errors or something

        System.out.printf("2 * %d = %d", num, num * 2); // 2 * 5 = 10
    }

}
