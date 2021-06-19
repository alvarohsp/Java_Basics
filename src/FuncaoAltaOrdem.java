public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a, b) -> a + b;
        Calculo SUB = (a, b) -> a - b;
        Calculo DIV = (a, b) -> a / b;
        Calculo MULT = (a, b) -> a * b;

        System.out.println(executarOperacao(SOMA, 1, 3));
        System.out.println(executarOperacao(SUB, 4, 3));
        System.out.println(executarOperacao(DIV, 4, 2));
        System.out.println(executarOperacao(MULT, 7, 3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b) {return calculo.calcular(a, b);}


    @FunctionalInterface
    interface Calculo {
        public int calcular(int a, int b);
    }
}
