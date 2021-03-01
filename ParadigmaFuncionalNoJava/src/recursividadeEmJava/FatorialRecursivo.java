package recursividadeEmJava;

public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial (int fat){
        if (fat == 1){
            return fat;
        } else{
            return  fat*fatorial((fat - 1));
        }
    }

}


