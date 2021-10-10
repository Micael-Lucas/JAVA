import java.util.Scanner;

public class LimitesDaEstrada
{
    public static void main(String[] args)
    {
        float AltMax, AltAferida;
        int PesMax, PesAferido;

        Scanner scan = new Scanner(System.in);

        PesMax = scan.nextInt();
        AltMax = scan.nextFloat();
        PesAferido = scan.nextInt();
        AltAferida = scan.nextFloat();

        if (PesAferido > PesMax || AltAferida > AltMax){
            System.out.println("IMPEDIDO");
        }
    }
}