import java.util.Scanner;

public class Tomadas
{
    public static void main(String[] args)
    {
        int Tum, Tdois, Ttres, Tquatro, MaxTom;

        Scanner scan = new Scanner(System.in);

        Tum = scan.nextInt();
        Tdois = scan.nextInt();
        Ttres = scan.nextInt();
        Tquatro = scan.nextInt();

        MaxTom = (Tum - 1) + (Tdois - 1) + (Ttres - 1) + Tquatro;

        System.out.println(MaxTom);
    }
}