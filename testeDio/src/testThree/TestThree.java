package testThree;

import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        /*Desafio
        *Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares,
        *quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.
        *Entrada
        *Você receberá 5 valores inteiros.*/

        Scanner leitor = new Scanner(System.in);

        int valorPar = 0, valorImpar = 0, valorPos =0, valorNeg = 0;

        for (int i = 0; i < 5; i++) {
            int valor = leitor.nextInt();

            if(valor>0){
                valorPos++;
            }
            if(valor < 0){
                valorNeg++;
            }

            if(valor%2 == 0){
                valorPar++;
            }else{
                valorImpar++;
            }

        }

        System.out.println( valorPar+ " valor(es) par(es)");
        System.out.println( valorImpar+ " valor(es) impar(es)");
        System.out.println( valorPos+ " valor(es) positivo(s)");
        System.out.println( valorNeg+ " valor(es) negativo(s)");

    }
}
