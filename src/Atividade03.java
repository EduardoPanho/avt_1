import java.util.Scanner;

public class Atividade03
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome = "";
        double primeiraNota = 0;
        double segundaNota = 0;
        double terceiraNota = 0;

        System.out.println("Informe seu Nome :");
        nome = sc.nextLine();

        System.out.println("Informe a Primeira nota:");
        primeiraNota = sc.nextDouble();

        System.out.println("Informe a Segunda nota:");
        segundaNota = sc.nextDouble();

        System.out.println("Informe a Terceira nota:");
        terceiraNota = sc.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.println(nome + " a sua média é : " + media);
    }
}