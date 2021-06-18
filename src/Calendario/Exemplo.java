package Calendario;

import java.util.Calendar;

public class Exemplo {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //Dom jul 16 18:03:11 BRT 2021

        System.out.printf("%tF\n", agora);
        //2021-07-16

        System.out.printf("%tD\n", agora);
        //07/16/21

        System.out.printf("%tr\n", agora);
        //06:03:11 PM

        System.out.printf("%tT\n", agora);
        //18:03:11
    }
}
