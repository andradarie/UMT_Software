package com.company;

import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("You have entered: " + str);
        String[] array = str.split("");
        CheckStatusPassword password = new CheckStatusPassword();
        password.CheckPasswordStatus(array);


    }
}



