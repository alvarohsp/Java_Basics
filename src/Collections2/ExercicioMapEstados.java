package Collections2;

import java.text.DecimalFormat;
import java.util.*;
import java.text.NumberFormat;

public class ExercicioMapEstados {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(",###");

        System.out.println("Crie um dicionário e relacione os estados e suas populações");

        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        estados.forEach((k, v) -> System.out.println(k + " - " + df.format(v)));

        System.out.println("Substitua a população do estado do RN por 3.534.165");
        estados.put("RN", 3534165);

        estados.forEach((k, v) -> System.out.println(k + " - " + df.format(v)));

        System.out.println("Confira se o estado PB está no Map, caso não adicione");

        if (!estados.containsKey("PB")) {
            estados.put("PB", 4039277);
        }

        estados.forEach((k, v) -> System.out.println(k + " - " + df.format(v)));

        System.out.println("Exiba a população de PE");

        System.out.println(df.format(estados.get("PE")));


        System.out.println("Exiba os estados na ordem que foi informado");
        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        estados2.forEach((k, v) -> System.out.println(k + " - " + df.format(v)));


        System.out.println("Exiba os estados na ordem alfabética");
        Map<String, Integer> estados3 = new TreeMap<>(estados2);

        estados3.forEach((k, v) -> System.out.println(k + " - " + df.format(v)));

        var menorEstado = Collections.min(estados2.values());
        System.out.println(menorEstado);










    }
}
