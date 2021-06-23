package Reading;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import java.util.Scanner;

public class ComprasMercado {
    public static void main(String[] args) throws IOException {

    Scanner teclado = new Scanner(System.in);

    int linhas = teclado.nextInt();

    LinkedHashSet<String> lista = new LinkedHashSet<>();

    for (int i = 0; i <= linhas; i++) {
        LinkedHashSet<String> set = new LinkedHashSet<>(List.of(teclado.nextLine().split(" ")));
        var linha = set.stream().sorted().collect(Collectors.joining(" "));

        lista.add(linha);
    }

    lista.forEach(System.out::println);
    }
}