package recursividadeEmJava;

import java.util.HashMap;
import java.util.Map;

public class FatorialMemoization {
    static Map<Integer,Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialMemoization(15));
        long F = System.nanoTime();
        System.out.println("Fatorial 1 = " + (F-I));

         I = System.nanoTime();
        System.out.println(fatorialMemoization(15));
         F = System.nanoTime();
        System.out.println("Fatorial 2 = " + (F-I));

    }


    public static  Integer fatorialMemoization(Integer valor){
        if (valor == 1){
           return  valor;
        }else {
            if (MAPA_FATORIAL.containsKey(valor)){
                return  MAPA_FATORIAL.get(valor);
            }else{
                Integer resultado = valor * fatorialMemoization(valor-1);
                MAPA_FATORIAL.put(valor,resultado);
                return resultado;
            }
        }
    }
}
