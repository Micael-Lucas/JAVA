import java.util.Scanner;

public class Ohvida
{
    public static void main(String[] args)
    {
        int tempo;
        String universidade;

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o tempo na Universidade: ");
        tempo = scan.nextInt();
        System.out.print("Informe o nome da Universidade: ");
        universidade = scan.next();

        System.out.println("Voce estuda na " + universidade + " há " + tempo + " anos.");
    }
}