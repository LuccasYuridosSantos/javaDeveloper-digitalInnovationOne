package testTwo;

import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {

        /*
        *Desafios
        *Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
        *Entrada
        *Você receberá 1 valor inteiro N, onde N > 0.
        */

        Scanner scanner = new Scanner(System.in);

        int valor = Integer.parseInt(scanner.nextLine());

        for (int i = 1 ; i <= valor  ; i++) {
            if (i%2 == 0  ) System.out.println(i);
        }
    }
}
