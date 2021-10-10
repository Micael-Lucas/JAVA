import java.util.Scanner;

public class Soma
{
    public static void main(String args[])
    {
        int a,b,resultado;
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        resultado = a+b;

        System.out.println(resultado);
    }
}