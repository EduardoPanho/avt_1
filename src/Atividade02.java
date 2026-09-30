import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double primeiroValor = 0;
        double segundoValor = 0;

        System.out.println("Informe o Primeiro valor:");
        primeiroValor = sc.nextDouble();

        System.out.println("Informe o Segundo valor:");
        segundoValor = sc.nextDouble();

        int soma = primeiroValor + segundoValor;
        double divisao = (double) primeiroValor / segundoValor;
        int multiplicacao = primeiroValor * segundoValor;
        int subtracao = primeiroValor - segundoValor;

        System.out.println("Soma : " + soma);
        System.out.println("Divisão : " + divisao);
        System.out.println("Multiplicação : " + multiplicacao);
        System.out.println("Subtração : " + subtracao);

    }
}