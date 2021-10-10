import java.util.Scanner;

public class NumerosAB
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        while(a!=b){
            if (a == b - 1){
                System.out.print(a+" ");
                a = a + 1;
                System.out.println(a);
            }
            else{
                System.out.print(a+" ");
                a = a + 1;
            }
        }
    }
}