package Calendario;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss (E)");
        //  2021/06/16 18:30:10 (水)

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);








    }
}
