package FuncoesEImutabilidadeEmParadigmaFuncional;

import java.util.function.UnaryOperator;

public class Funcional {
    public static void main(String[] args) {
        UnaryOperator<Integer> calValorTresVezes= valor -> valor*3;
        int valor = 10;
        System.out.println("O resultado de "+ valor +" * 3 = " + calValorTresVezes.apply(valor));
    }
}
