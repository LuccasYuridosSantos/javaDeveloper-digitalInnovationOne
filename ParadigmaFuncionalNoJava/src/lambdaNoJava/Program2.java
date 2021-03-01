package lambdaNoJava;

public class Program2 {

    public static void main(String[] args) {
        Funcao2 funcao2 = valor -> "Sr." + valor;

        System.out.println(funcao2.gerar("Luccas"));

    }

}
