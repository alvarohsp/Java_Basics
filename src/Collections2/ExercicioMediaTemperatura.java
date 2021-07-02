package Collections2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioMediaTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<mes> meses = new ArrayList<>();
        System.out.println("Insira a temperatura média de Janeiro: ");
        meses.add(new mes("Janeiro", teclado.nextDouble()));

        System.out.println("Insira a temperatura média de Fevereiro: ");
        meses.add(new mes("Fevereiro", teclado.nextDouble()));

        System.out.println("Insira a temperatura média de Março: ");
        meses.add(new mes("Março", teclado.nextDouble()));

        System.out.println("Insira a temperatura média de Abril: ");
        meses.add(new mes("Abril", teclado.nextDouble()));

        System.out.println("Insira a temperatura média de Maio: ");
        meses.add(new mes("Maio", teclado.nextDouble()));

        System.out.println("Insira a temperatura média de Junho: ");
        meses.add(new mes("Junho", teclado.nextDouble()));


        Double mediaMeses = 0d;

        for (mes mes : meses) {
            mediaMeses += mes.getTempMedia();
        }

        mediaMeses = mediaMeses / 6;

        System.out.println("A média de temperatura entre Janeiro e Junho é: " + String.format("%.2f", mediaMeses));

        for (mes mes : meses) {
            if (mes.getTempMedia() > mediaMeses){
                System.out.println("O mês de " + mes.getNomeMes() + " teve uma temperatura acima da média");
            }
        }
    }
}

class mes {
    private String nomeMes;
    private Double tempMedia;

    public mes (String nomeMes, Double tempMedia) {
        this.nomeMes = nomeMes;
        this.tempMedia = tempMedia;
    }

    public Double getTempMedia() {
        return tempMedia;
    }

    public String getNomeMes() {
        return nomeMes;
    }

    @Override
    public String toString() {
        return "mes{" +
                "nomeMes='" + nomeMes + '\'' +
                ", tempMedia=" + tempMedia +
                '}';
    }
}
