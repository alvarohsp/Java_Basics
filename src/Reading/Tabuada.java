package Reading;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Integer numeroTabuada;
        Scanner teclado = new Scanner(System.in);

        System.out.println("****Tabuada****");
        System.out.print("Digite um número para calcular a tabuada: ");
        numeroTabuada = teclado.nextInt();

        for (int x = 1; x <= 10; x++) {
            System.out.println(numeroTabuada + "x" + x + " = " + numeroTabuada * x);
        }
    }
}
