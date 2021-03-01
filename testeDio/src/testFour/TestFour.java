package testFour;

import java.util.Scanner;

public class TestFour {
    public static void main(String[] args) {

        /*Desafio
        *Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o
        *valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência
        *mostre o valor lido e a relação de notas necessárias.
        *Entrada
        *Você receberá um valor inteiro N (0 < N < 1000000).*/

        Scanner sc = new Scanner(System.in);

        int notaCem = 0, notaCinq = 0, notaVint = 0, notaDez = 0, notaCinc =0, notaDois = 0, notaUm =0;

        int valor = sc.nextInt();



        notaCem = (int)valor/100;
        notaCinq = (int)(valor%100)/50;
        notaVint =(int)((valor%100)%50)/20;
        notaDez = (int)(((valor%100)%50)%20)/10;
        notaCinc = (int)((((valor%100)%50)%20)%10)/5;
        notaDois =(int)(((((valor%100)%50)%20)%10)%5)/2;
        notaUm =(int)((((((valor%100)%50)%20)%10)%5)%2);

        System.out.println(valor+"\n"+notaCem +" nota(s) de R$ 100,00\n"+
                + notaCinq +" nota(s) de R$ 50,00\n"
                + notaVint +" nota(s) de R$ 20,00\n"
                + notaDez  +" nota(s) de R$ 10,00\n"
                + notaCinc +" nota(s) de R$ 5,00\n"
                + notaDois +" nota(s) de R$ 2,00\n"
                + notaUm   +" nota(s) de R$ 1,00");

        sc.close();

    }
}
