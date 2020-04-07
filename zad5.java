package com.lista;

import java.util.Scanner;

public class zad5 {
//5. Napisz program, który sprawdzi czy z podanych trzech liczb oznaczających długości boków można utworzyć trójkąt.
    public static void main(String[]args){
        System.out.println("Podaj długości boków trójkąta");
        Scanner scan=new Scanner(System.in);
        int FirstLength=scan.nextInt();
        int SecondLength=scan.nextInt();
        int ThirdLength=scan.nextInt();

        if(FirstLength+SecondLength>ThirdLength){
            System.out.println("Możesz stworzyć trójkąt");
        }
        else{
            System.out.println("Nie możesz stworzyć trójkąta");
        }
    }
}
