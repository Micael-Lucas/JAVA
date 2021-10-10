import java.util.Scanner;

public class Pisos
{
    public static void main(String[] args)
    {
        int larg, comp, p1, p2;

        Scanner scan = new Scanner(System.in);

        larg = scan.nextInt();
        comp = scan.nextInt();

        p1 = larg * comp + ((larg - 1) * (comp - 1));
        p2 = 2 * (comp - 1) + 2 * (larg - 1);

        System.out.println(p1);
        System.out.println(p2);

    }
}