package Collections2;

import java.util.*;

public class CList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        //notas.forEach(System.out::println);
        //notas.forEach(nota -> { System.out.println(nota);});

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem que form informados: ");

        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adiciona: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a menor nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //System.out.println("Exiba a soma dos valores: " + notas.stream().reduce(0d, (subtotal, element) -> subtotal + element));

        //System.out.println("Exiba a soma dos valores: " + notas.stream().reduce(0d, Double::sum));

        Double media = notas.stream().reduce(0d, Double::sum) / notas.size();
        System.out.println("Exiba a média das notas: " + media);

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);

        /*
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        */
        /*
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        var notasMaiorQue7 = notas.stream().filter(p -> p >= 7).toList();
        System.out.println(notasMaiorQue7);
        */

        //System.out.println("Apague toda a lista");
        //notas.clear();

        //System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        List<Double> novaLista = new LinkedList<>();

        novaLista.addAll(notas);

        System.out.println("Exibindo nova lista: " + novaLista);

        System.out.println("Mostre a primeira nota da lista: " + novaLista.get(0));

        System.out.println("Mostre a primeira nota da lista e remova-o: " + novaLista.remove(0));


        System.out.println("Exibindo nova lista: " + novaLista);
    }
}
