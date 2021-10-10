import java.util.Scanner;

public class FabricaDeChocolate
{
    public static void main(String[] args)
    {

        long a, b, c;

        Scanner scan = new Scanner(System.in);

        a = scan.nextLong();
        b = scan.nextLong();
        c = scan.nextLong();

        double aresta = 0;

        while (a != 0 || b != 0 || c != 0){
            aresta = 0;

            aresta = Math.pow((a*b*c),(1d/3d));

            aresta = (long) aresta;
            aresta = (float) aresta;

            System.out.printf("%.0f\n",aresta);

            a = scan.nextLong();
            b = scan.nextLong();
            c = scan.nextLong();
        }
    }
}