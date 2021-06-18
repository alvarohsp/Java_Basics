package Reading;

public class Pessoa {

    private String nome, categoriaImc;
    private double altura, peso, imc;

    public Pessoa(String nome, double altura, double peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getImcNumber() {
        return peso / (altura * altura);
    }

    public String calcularImc() {
        imc = peso / (altura * altura);

        if (imc < 15.0) {
            categoriaImc = "Sobpeso muito severo";
        } else if (imc <= 16.0) {
            categoriaImc = "Sobpeso severo";
        } else if (imc < 18.5) {
            categoriaImc = "Sobpeso";
        } else if (imc < 25.0) {
            categoriaImc = "Peso normal";
        } else if (imc < 30.0) {
            categoriaImc = "Sobrepeso";
        } else if (imc < 35.0) {
            categoriaImc = "Obesidade moderada";
        } else if (imc < 40.0) {
            categoriaImc = "Obesidade severa";
        } else {
            categoriaImc = "Obesidade muito servera \"mórbida\"";
        }

        String imcFormatado = String.format("%.2f", imc);
        return "IMC = " + imcFormatado + "\nCategoria: " + categoriaImc;
    }
}
