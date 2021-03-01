package application;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ProgramTreeMap {
    public static void main(String[] arg){

        TreeMap<String,String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("SC","Floianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","São Paulo");
        treeCapitais.put("BH","Belo Horizonte");

        System.out.println(treeCapitais);

        //Retona o primeiro elemento no topo da árvore
        System.out.println(treeCapitais.firstKey());

        //Retorna o ultimo elemento da árvore
        System.out.println(treeCapitais.lastKey());

        //Retorna a primeira chave abaixo na árvore da chave parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        //Retorna a primeira chave acima na árvore da chave parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        //retorna a primeiro elemento no topo da árvore
        System.out.println(treeCapitais.firstEntry().getKey()+" --"+ treeCapitais.firstEntry().getValue());

        //retorna a ultimo elemento no topo da árvore
        System.out.println(treeCapitais.lastEntry().getKey()+" --"+ treeCapitais.lastEntry().getValue());

        //retorna e remove o primeiro elemento no topo da árvore
        Map.Entry<String,String> firstEntry = treeCapitais.pollFirstEntry();

        //retorna e remove o ultimo elemento no topo da árvore
        Map.Entry<String,String> lasttEntry = treeCapitais.pollLastEntry();
        System.out.println("-------------Elementos removidos---------------\n"+firstEntry+"\n"+lasttEntry+"\n---------------------------------------------");

        System.out.println(treeCapitais);

        //Navega em todos  com chave do iterator
        Iterator<String> iterator = treeCapitais.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + "----" + treeCapitais.get(key));
        }
        System.out.println("\n-----------------------------------------------------------");
        for(String capital: treeCapitais.keySet()){
            System.out.println(capital +"---"+treeCapitais.get(capital));
        }

        System.out.println("\n-----------------------------------------------------------");
        for(Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey() +"----"+ capital.getValue());
        }
    }
}
