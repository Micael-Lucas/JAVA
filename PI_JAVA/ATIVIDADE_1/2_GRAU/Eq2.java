import java.util.Scanner;

public class Eq2
{
    public static void main(String[] args)
    {
        double a, b, c, delta, EqMais, EqMenos;

        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        delta = (b*b) -4*a*c;

        EqMais = ((-1 * b) + ( Math.sqrt(delta))) / (2*a);
        EqMenos = ((-1 * b) - ( Math.sqrt(delta))) / (2*a);

        System.out.printf("%.4f ", EqMais);
        System.out.printf("%.4f\n", EqMenos);
    }
}