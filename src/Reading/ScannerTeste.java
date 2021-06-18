package Reading;

import java.util.Scanner;

public class ScannerTeste {

    public static void main(String[] args) {

        String nome;
        int idade;
        double peso, salario;

        java.util.Scanner teclado = new java.util.Scanner(System.in);

        System.out.print("Olá. Qual o seu nome? ");
        nome = teclado.next();

        System.out.print("Olá, " + nome +  "! Qual a sua idade? ");
        idade = teclado.nextInt();

        System.out.println("Então você tem " + idade + " anos, hein? Você não é velho.");
        System.out.print("Quanto você pesa, " + nome + "? ");
        peso = teclado.nextDouble();

        System.out.print(peso + " kg! Melhor não contar pra ninguém. Finalmente, qual o seu salário " + nome + "? ");
        salario = teclado.nextDouble();

        System.out.println("Espero que sejam R$: " + salario + " por dia e não por mês!");
        System.out.println("Bem, obrigado por responder essas questões indelicadas, " + nome + ".");






    }
}
