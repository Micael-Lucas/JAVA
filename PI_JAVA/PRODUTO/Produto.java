import java.util.Scanner;

public class Produto
{
    public static void main(String[] args)
    {
        int Num1, Num2, Prod;

        Scanner scan = new Scanner(System.in);

        Num1 = scan.nextInt();
        Num2 = scan.nextInt();

        Prod = Num1 * Num2;

        System.out.println("PROD = " + Prod);
    }
}