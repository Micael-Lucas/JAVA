import java.util.Scanner;

public class DivTres
{
    public static void main(String[] args)
    {
        int numero, n1, n2, n3, n4;

        Scanner scan = new Scanner(System.in);

        numero =  scan.nextInt();

        n1 = numero%3;

        if (n1 == 0){
            System.out.println("divisivel por 3");
        }
        else {
            System.out.println("nao divisivel por 3");
        }
    }
}