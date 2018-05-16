package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum = 0;
        int count = 0;
        String str = "";
        for (int i = 1; i < a / 2; i++) {
            str = Integer.toString(i);
            for (int j = i + 1; j < a / 2 + 1; j++) {
                str = Integer.toString(j);
            }

        }
    }
}





