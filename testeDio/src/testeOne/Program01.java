package testeOne;

import java.util.Scanner;

public class Program01 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        double x = 0.0, y =0.0, consumo =0.0;

        x = sc.nextDouble();
        y = sc.nextDouble();

        consumo = x/y;

        System.out.println(String.format("%.3f",consumo));

        sc.close();
    }
}
