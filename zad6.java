package com.lista;

import java.util.Scanner;

public class zad6 {
    //6. Napisz program, który sprawdzi czy z podanych trzech liczb oznaczających długości boków można utworzyć trójkąt prostokątny.
    //warunek trójkąta prostokątnego  (a*a+b*b==c*c) || (a*a+c*c==b*b) || (c*c+b*b==a*a)
    public static void main(String[] args) {
        System.out.println("Podaj długości boków trójkąta");
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==a*a){
            System.out.println("Trójkąt jest prostokątny");
        }
        else{
            System.out.println("Trójkąt nie jest prostokątny");
        }
    }
}