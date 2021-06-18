package Reading;

import java.util.Scanner;

public class RaizQuadrada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numeroInserido, raizQuadrada;

        System.out.print("Informe um número real e eu lhe direi qual a raiz quadrada dele. : ");
        numeroInserido = teclado.nextDouble();

        if (numeroInserido < 0) { numeroInserido = Math.abs(numeroInserido);}


        raizQuadrada = Math.sqrt(numeroInserido);

        System.out.println("A raiz quadrada de " + numeroInserido + " é " + raizQuadrada);

    }
}
