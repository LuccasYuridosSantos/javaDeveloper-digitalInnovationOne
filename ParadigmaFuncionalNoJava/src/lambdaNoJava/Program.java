package lambdaNoJava;

public class Program {

    public static void main(String[] args) {
        Funcao funcao = valor -> valor*2;

        System.out.println(funcao.gerar(2));
    }

}
