package thread;

public class APIThread {

    public static void main(String[] args) {

//       BarraDeCArregamento2 barra = new BarraDeCArregamento2();
//       BarraDeCArregamento3 barra3 = new BarraDeCArregamento3();
//
//
//       barra.start();
//       barra3.start();
//
//        barra.run();
//        barra3.run();
//
//        Thread thread = new Thread(new BarraDeCArregamento4());
//        Thread thread2 = new Thread(new BarraDeCArregamento4());
//
//        System.out.println("Nome da thread : " + thread.getName());
//        System.out.println("Nome da thread2 : " + thread2.getName());

        GerarPDF inciar = new GerarPDF();
        BarraDeCArregamento iniciar = new BarraDeCArregamento(inciar);

        iniciar.run();




    }

}

class GerarPDF extends   Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Iniciar Geração de PDF");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF gerado");


    }
}

class BarraDeCArregamento extends   Thread{

    private Thread geradorPDF;

    public BarraDeCArregamento (Thread geradorPDF){
        this.geradorPDF = geradorPDF;
    }

    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(500);
                if(!geradorPDF.isAlive()){
                    break;
                }
                System.out.println("Loading.....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class BarraDeCArregamento2 extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Rodei BarraDeCArregamento2: " + this.getName());


    }
}

class BarraDeCArregamento3 extends Thread{

    @Override
    public void run() {

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Rodei BarraDeCArregamento3: " + this.getName());


    }
}

class BarraDeCArregamento4 implements Runnable{

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Rodei BarraDeCArregamento3: ");


    }
}

