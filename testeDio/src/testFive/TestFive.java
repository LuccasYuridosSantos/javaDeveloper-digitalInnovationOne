package testFive;

import java.util.Scanner;

public class TestFive {
    public static void main(String[] args) {

       /* Desafio
        Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km)
        e o total de combustível consumido (em litros).
        Entrada
        Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y
        que representa o total de combustível consumido, com um dígito após o ponto decimal.*/

        Scanner sc = new Scanner(System.in);

        double x  =0.0, y =0.0, consumo =0.0;

        x = sc.nextDouble();
        y = sc.nextDouble();

        consumo = x/y;

        System.out.println(String.format("%.3f",consumo)+ " km/l");

        sc.close();



    }
}
