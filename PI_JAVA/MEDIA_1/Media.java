import java.util.Scanner;

public class Media
{
    public static void main(String[] args)
    {
        float a,b;
        double media;

        Scanner scan = new Scanner(System.in);

        a = scan.nextFloat();
        b = scan.nextFloat();

        media = ((3.5f*a) + (7.5f*b))/11f;

        System.out.printf("MEDIA = " + "%.5f\n",media);
    }
}