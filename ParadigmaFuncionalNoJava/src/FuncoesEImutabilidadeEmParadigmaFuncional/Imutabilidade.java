package ParadigmaFuncionalNoJava;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {

        int valor = 15;

        UnaryOperator<Integer> returnDouble = v -> v * 2;

        System.out.println(returnDouble.apply(valor));//retorna o dobro do valor
        System.out.println(valor);// o valor permanece o mesmo(valor não alterado)
    }
}
