import java.util.Scanner;

public class NumerosParesAB
{
    public static void main(String[] args)
    {
        int a, b, analisaA;
        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        analisaA = a;

        while(a < b){
            if (b - a == 1){
                if (b%2 == 0){
                    System.out.println(b);
                    break;
                } else if (a%2 == 0){
                    System.out.println(a);
                    break;
                }
            }
            else if (a%2 == 1){
                a = a + 1;
                System.out.print(a+" ");
                a = a + 2;
            }
            else if (a%2 == 0){
                if (a + 3 == b){
                    System.out.print(a+" ");
                    a = a + 2;
                    System.out.println(a);
                    break;
                }
                else if (a + 2 == b){
                    System.out.print(a+" ");
                    a = a + 2;
                    System.out.println(a);
                }
                else {
                    System.out.print(a+" ");
                    a = a + 2;
                }
            }

        }
    }
}