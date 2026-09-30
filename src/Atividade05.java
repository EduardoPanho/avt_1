import java.util.Scanner;

public class Atividade05
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome = "";
        double horasTrabalhadas = 0;
        double valorHora = 0;

        System.out.println("Informe seu Nome:");
        nome = sc.nextLine();

        System.out.println("Informe suas horas trabalhadas:");
        horasTrabalhadas = sc.nextDouble();

        System.out.println("Informe o valor da hora:");
        valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}