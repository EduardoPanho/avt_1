import java.util.Scanner;

public class Atividade06
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome = "";
        double comprimento = 0;
        double largura = 0;

        System.out.println("Informe seu Nome:");
        nome = sc.nextLine();

        System.out.println("Informe o comprimento do terreno:");
        comprimento = sc.nextDouble();

        System.out.println("Informe a largura do terreno:");
        largura = sc.nextDouble();

        double area = comprimento * largura;

        System.out.println("Nome: " + nome);
        System.out.println("Área do terreno: " + area);
    }
}