package Collections2;

import java.util.*;

public class ExercicioArcoIris {
    public static void main(String[] args) {

        Set<String> arcoIris = new LinkedHashSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Laranja");
        arcoIris.add("Amarelo");
        arcoIris.add("Verde");
        arcoIris.add("Azul");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");

        // Exiba todas as cores uma abaixo da outra
        arcoIris.forEach(System.out::println);
        System.out.println("\n");

        // A quantidade de cores que o arco-íris tem
        System.out.println(arcoIris.size());
        System.out.println("\n");

        // Exiba as cores na ordem alfabética
        var sortedArcoIris = arcoIris.stream().sorted().toList();
        sortedArcoIris.forEach(System.out::println);
        System.out.println("\n");

        // Exiba as cores na ordem inversa
        List<String> invertedArcoIris = new ArrayList<>(arcoIris);
        Collections.reverse(invertedArcoIris);

        invertedArcoIris.forEach(System.out::println);
        System.out.println("\n");

        // Exiba todas as cores que começam com a letra "v"

        var letraV = invertedArcoIris.stream().filter(val -> val.toLowerCase().startsWith("v"));
        letraV.forEach(System.out::println);


        Iterator<String> iterator = invertedArcoIris.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next().toLowerCase();
            if (next.startsWith("v")) {
                iterator.remove();
            }
        }

        System.out.println(invertedArcoIris);

        invertedArcoIris.clear();

        System.out.println("Conjunto limpo: " + invertedArcoIris.isEmpty());



    }
}
