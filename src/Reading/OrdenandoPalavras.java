package Reading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class OrdenandoPalavras {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int linhas = Integer.parseInt(st.nextToken());

        List<String> listaPalavras = new ArrayList<>();

        for (int i = 0; i < linhas; i++) {

            var frase = br.readLine().split(" ");

            listaPalavras.add(Arrays.stream(frase).sorted((o1, o2) -> {
                if (o1.length() < o2.length())
                    return 1;
                if (o1.length() > o2.length())
                    return -1;
                if (o1.length() == o2.length()) {
                    if (o1.compareTo(o2) == 1)
                        return 1;
                    if (o1.compareTo(o2) == -1)
                        return -1;
                }
                    return 0;
            }).collect(Collectors.joining(" ")));
        }

        listaPalavras.forEach(System.out::println);
    }
}