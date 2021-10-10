import java.util.Scanner;

public class Media2
{
    public static void main(String[] args)
    {
        float a,b,c;
        double media;

        Scanner scan = new Scanner(System.in);

        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();

        media = ((2f*a) + (3f*b) + (5f*c))/10f;

        System.out.printf("MEDIA = " + "%.1f\n",media);
    }
}