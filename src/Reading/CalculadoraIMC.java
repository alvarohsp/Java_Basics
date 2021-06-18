package Reading;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double altura, peso, imc;
        String nome;

        double rNumber;

        rNumber = (int)(Math.random() * 100);
        System.out.print(rNumber);

        System.out.print("Qual seu nome: ");
        nome = teclado.next();

        System.out.print("Sua altura em metros: ");
        altura = teclado.nextDouble();

        System.out.print("Seu peso em quilos: ");
        peso = teclado.nextDouble();

        Pessoa pessoa = new Pessoa(nome, altura, peso);

        System.out.println(pessoa.calcularImc());


    }
}
