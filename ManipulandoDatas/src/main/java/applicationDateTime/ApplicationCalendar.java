package applicationDateTime;

import java.util.Calendar;

public class ApplicationCalendar {
    public static void main(String[] args) {

        // Pegando o instante atual
        Calendar now = Calendar.getInstance();
        //mostrando todas as informações do objeto
        System.out.println(now);

        //apresentando a data ex:Wed Feb 24 11:36:52 BRT 2021
        System.out.println("A data corrente é: "+ now.getTime());

        //estou alterando a data retirando 20 dias
        now.add(Calendar.DATE, -20);
        //irei retorna a data com alteração feito acima ex: Thu Feb 04 11:38:56 BRT 2021
        System.out.println("20 dias  atrás: " + now.getTime());

        //Estou adicionando 3 meses a data
        now.add(Calendar.MONTH, 3);
        System.out.println(now.getTime());

        //Estou adicionando 2 anos a data
        now.add(Calendar.YEAR, 2);
        System.out.println(now.getTime());


        System.out.printf("%tc\n",now);

        System.out.printf("%tF\n",now);

        System.out.printf("%tD\n",now);

        System.out.printf("%tr\n",now);

        System.out.printf("%tT\n",now);



    }
}
