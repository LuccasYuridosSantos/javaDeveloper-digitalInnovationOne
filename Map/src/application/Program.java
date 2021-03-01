package application;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public  class Program {
    public static void main (String[] args) throws IOException {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter way of path file:  ");
        String path = sc.nextLine();

        Map<String, Integer > votes = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){

                String[] fields = line.split(",");
                String name = fields[0];
                int vote = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)){
                    int votesSoFar = votes.get(name);
                    votes.put(name, vote + votesSoFar);
                }else{
                    votes.put(name, vote);
                }

                line = br.readLine();

            }

            for ( String key : votes.keySet()){
                System.out.println(key + ", " + votes.get(key));
            }
        }catch ( IOException e){
            System.out.println("Error : " + e.getMessage());
        }


        sc.close();
    }

}
