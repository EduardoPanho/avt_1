import java.util.Scanner;

public class Atividade04
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome = "";
        int anoNascimento = 0;
        int anoAtual = 0;

        System.out.println("Informe seu Nome:");
        nome = sc.nextLine();

        System.out.println("Informe seu ano de Nascimento:");
        anoNascimento = sc.nextInt();

        System.out.println("Informe o Ano atual:");
        anoAtual = sc.nextInt();

        int idadeReal = anoAtual - anoNascimento;

        System.out.println(nome + " possui aproximadamente " + idadeReal + " anos.");
    }
}