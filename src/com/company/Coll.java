package com.company;

import java.util.Scanner;

public class Coll {

    public void Coll()
    {
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the new number to show collatz sequence");
        num = Integer.parseInt(scn.nextLine());

        System.out.print(num + " ");

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 != 0) {
                num = (num * 3) + 1;
            }
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
