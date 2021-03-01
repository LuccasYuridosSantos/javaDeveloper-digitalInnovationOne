package funcoesDeAltaOrdem;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
//        Supplier<Pessoa> instacia = ()-> {
//            return new Pessoa();
//        };

//        Supplier<Pessoa> instacia =()-> new Pessoa();

        Supplier<Pessoa> instacia = Pessoa::new;

        System.out.println(instacia.get());
    }
}

 class Pessoa{
    private  String name;
    private Integer idade;

     public Pessoa() {
         this.idade = 21;
         this.name = "Yuri";
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Integer getIdade() {
         return idade;
     }

     public void setIdade(Integer idade) {
         this.idade = idade;
     }

     @Override
     public String toString() {
         return String.format("Nome: %s, idade: %d",name,idade);
     }
 }