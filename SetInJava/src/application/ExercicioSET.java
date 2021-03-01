package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioSET {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String path = "C:\\Temp\\in.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String in = br.readLine();
            while ( br != null){

            }

        }catch (RuntimeException | FileNotFoundException e){
            System.out.println("Error :" + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
