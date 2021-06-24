package Reading;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class OrdenandoParesImpares {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        int linhas = teclado.nextInt();

        List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < linhas; i++) {

            listaNumeros.add(teclado.nextInt());
        }

        List<Integer> pares = listaNumeros.stream().filter(n -> n % 2 == 0).sorted().collect(Collectors.toList());
        var impares = listaNumeros.stream().filter(n -> n % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Integer> total = new ArrayList<>();

        total.addAll(pares);
        total.addAll(impares);
        total.forEach(System.out::println);

    }
}