import java.util.Scanner;

public class DivisaoExata
{
    public static void main(String[] args)
    {
        long A,B,div;

        Scanner scan = new Scanner(System.in);

        A = scan.nextLong();
        B = scan.nextLong();

        div = A%B;

        if (div==0){
            System.out.println("a divisao de " + A +" por " + B + " eh exata.");
        }
    }
}