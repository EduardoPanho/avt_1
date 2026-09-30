import java.util.Scanner;

public class Atividade07
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String nome = "";
        double distanciaPercorrida = 0;
        double quantidadeLitros = 0;

        System.out.println("Informe seu Nome:");
        nome = sc.nextLine();

        System.out.println("Informe a distância percorrida:");
        distanciaPercorrida = sc.nextDouble();

        System.out.println("Informe a quantidade de litros utilizados:");
        quantidadeLitros = sc.nextDouble();

        double consumo = distanciaPercorrida / quantidadeLitros;

        System.out.println("Nome: " + nome);
        System.out.println("Consumo médio: " + consumo + " km/l");
    }
}