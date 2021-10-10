import java.util.Scanner;

public class TiraTeima
{
    public static void main(String[] args)
    {
        int xEnt , yEnt;

        Scanner scan = new Scanner(System.in);

        xEnt = scan.nextInt();
        yEnt = scan.nextInt();

        if (xEnt < 0 || xEnt > 432)
        {
            System.out.println("fora");
        }
        else if (yEnt < 0 || yEnt > 468)
        {
            System.out.println("fora");
        }
        else
        {
            System.out.println("dentro");
        }
    }
}