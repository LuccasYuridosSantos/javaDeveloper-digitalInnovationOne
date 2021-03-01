package application;

import java.util.Hashtable;
import java.util.Map;

public class ProgramHashTable {
    public static  void main(String[] args){
        Hashtable<String, Integer> students = new Hashtable<>();

        students.put("Carlos", 21);
        students.put("Mariana", 33);
        students.put("Rafaela", 18);
        students.put("Pedro", 44);

        System.out.println(students);

        //atualizar valor
        students.put("Pedro", 55);
        System.out.println(students);

        //remove o elemento, passando o elemento completo, ou chave, ou valor
        students.remove("Pedro");

        System.out.println(students);

        //recupera o valor do elemento
        int idade = students.get("Mariana");

        System.out.println(idade);

        //retorna o tamanho do HashTable
        System.out.println(students.size());

        //navega pelos elementos do HashTable com foreach
        for(Map.Entry<String, Integer> entry: students.entrySet()){
            System.out.println(entry.getKey() +" -- "+ entry.getValue());
        }

        for(String key: students.keySet()) {
            System.out.println(key + " --- " + students.get(key));
        }

        System.out.println(students);
    }
}
