package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class API {
    private static final ExecutorService threadPool = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        List<? extends Future<String>> future = casa.obterAfazeres().stream()
                .map(atividade -> threadPool.submit(() -> {
                            try {
                                return atividade.realizar();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return null;
                        })
                ).collect(Collectors.toCollection(CopyOnWriteArrayList::new));

        while (true){
            int atividadesNaoRealizadas = 0;
            for(Future<?> future1: future) {
                if (future1.isDone()) {
                    try {
                        System.out.println("Parabens " + future1.get());
                        future.remove(future1);
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                } else {
                    atividadesNaoRealizadas++;
                }
            }
            if (!future.stream().allMatch(Future::isDone)){
                break;
            }
            System.out.println("Numeros de atividades não finalidas: " + atividadesNaoRealizadas);
            Thread.sleep(5000);

        }
        threadPool.shutdown();
    }

}

class Casa{
    private final List<Comodo> comodos;

    Casa(Comodo comodos){
        this.comodos = Collections.singletonList(comodos);
    }

    List<Atividade> obterAfazeres(){
        return this.comodos.stream().map(Comodo::obterAFazerDoComodo)
                .reduce(new ArrayList<>(), (pivo, atividades) ->{
                   pivo.addAll(atividades);
                   return pivo;
                });
    }
}
interface Atividade{
    String realizar() throws InterruptedException;
}

abstract  class  Comodo{
    abstract  List<Atividade> obterAFazerDoComodo();
}

class Quarto extends Comodo{

    @Override
    List<Atividade> obterAFazerDoComodo() {
        return Arrays.asList(
                this::arrumarACama,
//                () -> this.arrumarACama(),
                this::varrerOQuarto,
//                () -> this.varrerOQuarto(),
                this::arrumarGuardaRoupa
//                () -> this.arrumarGuardaRoupa()
        );
    }

    private  String arrumarGuardaRoupa() throws InterruptedException{
        Thread.sleep(5000);
        String a = "Arrumar o guarda roupa";
        System.out.println(a);
        return a;
    }

    private  String arrumarACama()throws  InterruptedException{
        String a = "Arrumaar a cama";
        Thread.sleep(5000);
        System.out.println("Arrumaar a cama");
        return a;
    }

    private String varrerOQuarto() throws  InterruptedException{
        Thread.sleep(5000);
        System.out.println("Varrer o quarto");
        return "Varrer o quarto";
    }
}