import java.util.Scanner;

public class Retas
{
    public static void main(String[] args)
    {
        float a, b, c, d;

        Scanner scan = new Scanner(System.in);

        a =  scan.nextFloat();
        b =  scan.nextFloat();
        c =  scan.nextFloat();
        d =  scan.nextFloat();

        if (a==c && b!=d){
            System.out.println("paralelas");
        }
        else if (a==c && b==d){
            System.out.println("coincidentes");
        }
        else {
            System.out.println("concorrentes");
        }
    }
}