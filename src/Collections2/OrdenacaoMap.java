package Collections2;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        /*
        // forma 1
        meusLivros.forEach((key, value) -> System.out.println(key + " - " + value.getNome()));

        // forma 2
        meusLivros.entrySet().forEach(livro -> {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        });
        */
        // forma 3
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem inserção\t--");

        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        meusLivros2.forEach((key, value) -> System.out.println(key + " - " + value.getNome()));


        System.out.println("--\tOrdem alfabética autores\t--");

        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
        meusLivros3.forEach((key, value) -> System.out.println(key + " - " + value.getNome()));

        System.out.println("--\tOrdem alfabética nome dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros.entrySet());
        meusLivros4.forEach((value) -> System.out.println(value.getKey() + " - " + value.getValue().getNome()));

        System.out.println("--\tOrdem número de páginas\t--");
        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorNumPag());
        meusLivros5.addAll(meusLivros.entrySet());
        meusLivros5.forEach((value) -> System.out.println(value.getKey() + " - " + value.getValue().getNome() + " - " + value.getValue().getPaginas()));

    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }


    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {


    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}


class ComparatorNumPag implements Comparator<Map.Entry<String, Livro>> {


    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}