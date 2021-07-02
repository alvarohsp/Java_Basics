package Collections2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioVitima {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<String> sn = new ArrayList<>();
        System.out.println("Responda com s/n\n");

        System.out.println("Telefonou para a vítima?");
        sn.add(teclado.next());

        System.out.println("Esteve no local do crime?");
        sn.add(teclado.next());

        System.out.println("Mora perto da vítima?");
        sn.add(teclado.next());

        System.out.println("Devia para a vítima?");
        sn.add(teclado.next());

        System.out.println("Já trabalhou com a vítima?");
        sn.add(teclado.next());

        var sim = sn.stream().filter(value -> value.equals("s")).toList();

       if (sim.size() <= 1) {
           System.out.println("Inocente!");
       } else if (sim.size() <= 2) {
           System.out.println("Suspeita!");
       } else if (sim.size() <= 4){
           System.out.println("Cúmplice!");
       } else {
           System.out.println("Assassina!");
       }

    }
}
