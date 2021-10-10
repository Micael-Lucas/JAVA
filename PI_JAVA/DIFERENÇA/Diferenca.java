import java.util.Scanner;

public class Diferenca
{
    public static void main(String[] args)
    {
        int a,b,c,d,dif;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        dif = (a*b) - (c*d);

        System.out.println(dif);
    }
}