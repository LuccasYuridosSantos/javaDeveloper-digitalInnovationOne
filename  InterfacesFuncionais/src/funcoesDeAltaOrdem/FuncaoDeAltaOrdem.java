package funcoesDeAltaOrdem;

public class FuncaoDeAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a,b) -> a+b;
        Calculo SUBTRACAO = (a,b) -> a-b;
        Calculo MULTIPLICACAO = (a,b) -> a*b;
        Calculo DIVISAO = (a,b) -> a/b;



        System.out.println(excutarOperacao(SOMA,1,3));
        System.out.println(excutarOperacao(SUBTRACAO,1,3));
        System.out.println(excutarOperacao(MULTIPLICACAO,1,3));
        System.out.println(excutarOperacao(DIVISAO,1,1));


    }

    public static int excutarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}

@FunctionalInterface
interface Calculo{
    public int calcular(int a, int b );
}
