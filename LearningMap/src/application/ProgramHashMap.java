package application;

import java.util.HashMap;
import java.util.Map;

public class ProgramHashMap {
    public static  void main(String[] args){

        HashMap<String, Integer> championsWorld = new HashMap<>();

        //método put para adicionar elementos
        championsWorld.put("Brasil",5);
        championsWorld.put("Alemanha",4);
        championsWorld.put("Itália",4);
        championsWorld.put("Uruguai",2);
        championsWorld.put("Argentina",2);
        championsWorld.put("França",2);
        championsWorld.put("Inglaterra",1);
        championsWorld.put("Espanha",1);

        System.out.println(championsWorld);

        //método put também faz atualização de valor, passando a chave
        championsWorld.put("Brasil",6);

        System.out.println(championsWorld);

        //método get retorna o valor relacionado a chave
        System.out.println(championsWorld.get("aiai"));

        //Retorna se existe ou não o elemento com chave especificada
        System.out.println(championsWorld.containsKey("França"));

        //remove um elemento de acordo com chave passada
        championsWorld.remove("França");
        System.out.println(championsWorld);

        System.out.println(championsWorld.containsKey("França"));

        //método retorna  se existe elemento com o valor passado
        System.out.println(championsWorld.containsValue(6));

        //retorna o tamanho
        System.out.println(championsWorld.size());

        //utilizando o foreach no map é necesario usar Map.Entry  e o método entrySet() no objeto
        for (Map.Entry<String, Integer> entry: championsWorld.entrySet()) {
            System.out.println(entry.getKey() +"----"+entry.getValue());
        }

        for (String key: championsWorld.keySet()) {
            System.out.println(key + "---" + championsWorld.get(key));
        }




    }
}
