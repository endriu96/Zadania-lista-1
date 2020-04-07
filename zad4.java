package com.lista;

public class zad4 {
    //Pętle.Wyświetl liczby od 1 do 100 podzielne bez reszty:
    // a)przez 3
    //b)przez 5
    //c)przez 3 i 5 jednocześnie

    public static void main (String[]args) {
        //a
        for (int i = 3; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }
        //b
        for (int i = 5; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);

            }
        }

        for (int i = 0; i < 100; i++) {//Jak pominąć pierwsze ,,i" w pętli?
            if (i % 5 == 0 && i%3==0) {
                System.out.println(i);

    }
}}}