package com.lista;

import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {
        // Zadanie 3   instrukcje warunkowe
        System.out.println("Podaj swój wiek");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println("Nie możesz głosować");
        } else if (age >18 && age < 35) {
            System.out.println("Możesz głosować, ale nie możesz zostać wybrany na prezydenta");
        } else {
            System.out.println("Możesz kandydować na prezydenta");
        }
    }
}
