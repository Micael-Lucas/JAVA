import java.util.Scanner;

public class AreaCirculo
{
    public static void main(String[] args)
    {
        double raio, area, areat;

        Scanner scan = new Scanner(System.in);

        raio = scan.nextDouble();

        area = Math.pow(raio,2f);
        areat = area * 3.1415;

        System.out.printf("A=" + "%.4f\n", areat);
    }
}