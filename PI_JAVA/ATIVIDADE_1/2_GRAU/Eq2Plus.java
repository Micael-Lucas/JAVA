import java.util.Scanner;

public class Eq2Plus
{
    public static void main(String[] args)
    {
        double a, b, c, delta, EqMais, EqMenos, eq;

        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        delta = (b*b) -4*a*c;

        if (delta > 0){

            EqMais = ((-1 * b) + ( Math.sqrt(delta))) / (2*a);
            EqMenos = ((-1 * b) - ( Math.sqrt(delta))) / (2*a);

            System.out.printf("%.4f ", EqMais);
            System.out.printf("%.4f\n", EqMenos);

        }

        else if (delta == 0) {

            eq = (-1 * b)/(2*a);
            System.out.printf("%.4f\n", eq);

        }

        else {

            System.out.println("nao ha raiz real");
        }
    }
}