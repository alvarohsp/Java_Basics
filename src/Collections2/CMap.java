package Collections2;

import java.util.*;
import java.util.Collections;

public class CMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carros = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros);

        System.out.println("Substitua o consumo do gol para 15.2");
        carros.put("gol", 15.2);
        System.out.println(carros);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carros.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carros.get("uno"));

        //System.out.println("Exiba o terceiro modelo adicionado: ");
        // Não é possivel

        Set<String> modelos = carros.keySet();
        System.out.println("Exiba os modelos: " + modelos);

        System.out.println("Exiba os consumos dos carros: " + carros.values());

        Double maisEficiente = Collections.max(carros.values());
        System.out.println("Exiba o modelo mais econômico e seu consumo: " + maisEficiente);

        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(maisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + maisEficiente);
            }
        }

        Double menosEficiente = Collections.min(carros.values());
        System.out.println("Exiba o modelo menos econômico e seu consumo: " + maisEficiente);
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : carros.entrySet()) {
            if (entry.getValue().equals(menosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + menosEficiente);
            }
        }


        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        var somaBoa = carros.values().stream().reduce(0d, Double::sum);
        System.out.println("Exiba a soma dos consumos: " + somaBoa);


        System.out.println("Exiba a média dos consumos deste dicionário: " + (soma/carros.size()));

        System.out.println("Remova os modelos com o consumo igual a 15.6 km/l: ");
        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carros);

        Map<String, Double> carros2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros2);

        System.out.println("Exiba o dicionário ordenando pelo modelo: ");
        Map<String, Double> carros3 = new TreeMap<>(carros2);
        System.out.println(carros3);

        System.out.println("Apague o dicionário");
        carros3.clear();

        System.out.println("Confira se o dicionário está vazio: " + carros3.isEmpty());






    }
}
