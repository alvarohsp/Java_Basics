package Collections2;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

        List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista");

        numeros.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numero e bote dentro de um set");
        numeros.stream()
                .limit(5)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("Transforme essa lista de String em uma lista de Inteiros");

        var numerosInt = numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        /*
        numerosInt.forEach(System.out::println);

        */
        numeros.stream()
                .map(n -> Integer.parseInt(n))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista");

        numeros.stream()
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0 && n > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Mostre a média dos numeros");

        /*
        var numerosSoma = numeros.stream().map(Double::parseDouble).reduce(0d, (t, u) -> t + u);
        System.out.println(String.format("%.2f", numerosSoma / numeros.size()));
        */
        numeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        /*
        System.out.println("Remova os valores impares");
        numerosInt.removeIf(s -> s % 2 != 0);

        System.out.println(numerosInt);
        */

        //System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante");


        Set<Integer> numerosSemRepeticao = new HashSet<>(numerosInt);
        System.out.println("Retirando os números repetidos da lista, quantos números ficam: " + numerosSemRepeticao.size());

        System.out.println("Mostre o menor valor da lista: " + Collections.min(numerosSemRepeticao));


        System.out.println("Mostre o maior valor da lista: " + Collections.max(numerosSemRepeticao));



        var numImpSomados = numerosSemRepeticao.stream()
                .filter(f -> f % 2 != 0)
                .reduce(0, Integer::sum);
        System.out.println("Pegue apenas os números impares e some: " + numImpSomados);


        System.out.println("Mostre a lista na ordem númerica " + numerosSemRepeticao);

        var numImpMult = numerosSemRepeticao.stream()
                .filter(f -> f % 2 != 0 && f % 3 == 0 || f % 5 == 0)
                .collect(Collectors.toList());
        System.out.println("Agrupe os valores impares múltiplos de 3 e de 5");
        System.out.println(numImpMult);


    }
}
