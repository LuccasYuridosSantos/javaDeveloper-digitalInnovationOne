package exampleOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class Inferencia {

    public static void main(String[] args)throws IOException {
//        URL url = new URL("https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html");
//        URLConnection urlConnection = url.openConnection();
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        printNomeCompleto("João", "Santos");

        printSum(5,9);

        sum(5,3,4,8,6,20,11);

       connectAndPrintUrl();

    }

    private static void connectAndPrintUrl() {


        try{
            var url = new URL("https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html");
            var urlConnection = url.openConnection();
            try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }




    }

    public static void printNomeCompleto(String nome , String sobrenome){
        var nomeCompleto = String.format("%s %S",nome,sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printSum(int a, int b){
        var sum = a+b;
        System.out.println("Soma = "+ sum);
    }

    public static void sum(int... numbers){
        var soma = 0;
        for (var number: numbers) {
            soma += number;
        }
        System.out.println("Valor da soma = "+ soma);
    }

    /*Pode ser utilizado*/
    //Pode ser utilizado em variaveis locais inicializadas
    //Variavel  suporte do enchaced for
    //variavel try with resource



    /*      Não pode ser utilizado      */
    //var não pode ser utilizado em nível de classe
    //var não pode ser utilizado como parâmetro
    //var não pode ser utilizado em variaveis locais não inicializadas
}
