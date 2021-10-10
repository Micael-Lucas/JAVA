import java.util.Scanner;

public class TreinoCorrida
{
    public static void main(String[] args)
    {
        int tamPista, exercicios, distmais;

        Scanner scan = new Scanner(System.in);

        exercicios = scan.nextInt();
        tamPista = scan.nextInt();

        distmais = exercicios%tamPista;

        System.out.println(distmais);
    }
}