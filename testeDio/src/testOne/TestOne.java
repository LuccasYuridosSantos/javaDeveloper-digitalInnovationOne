package testOne;

import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {

        /*  Desafio
        *Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada,
        *devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.
        *Entrada
        *Você receberá seis valores, negativos e/ou positivos.
        */

        Scanner scanner = new Scanner(System.in);

        double numerosDigitados=0.0;

        int cont = 0;

        int positivos = 0;

        while (cont<6) {

            numerosDigitados = scanner.nextDouble();

            if(numerosDigitados > 0) {

                positivos++;

            }

            cont++;

        }

        System.out.println(positivos +" valores positivos" );
    }
}
