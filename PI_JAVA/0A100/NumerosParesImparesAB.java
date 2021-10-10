import java.util.Scanner;

public class NumerosParesImparesAB
{
    public static void main(String[] args)
    {
        int a, b, resetaA;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        resetaA = a;

        while (a<=b){
            if (a%2 == 0 && b%2 == 0){
                if (a==b-2){
                    System.out.print(a + " ");
                    System.out.println(b);
                    break;
                } else {
                    System.out.print(a+" ");
                    a = a + 2;
                }
            }
            else if (a%2 == 0 && b%2 == 1){
                if (a==b-1){
                    System.out.println(a);
                    break;
                } else {
                    System.out.print(a+" ");
                    a = a + 2;
                }
            }
            else if (a%2 == 1 && b%2 == 0){
                if (a==b-1){
                    System.out.println(b);
                    break;
                } else {
                    a = a + 1;
                    System.out.print(a+" ");
                    a = a + 1;
                }
            }
            else if (a%2 == 1 && b%2 == 1){
                if (a==b-2){
                    a = a + 1;
                    System.out.println(a);
                    break;
                } else {
                    a = a + 1;
                    System.out.print(a+" ");
                    a = a + 1;
                }
            }
        }

        a = resetaA;

        while (a<=b){
            if (a%2 == 1 && b%2 == 1){
                if (a==b-2){
                    System.out.print(a + " ");
                    System.out.println(b);
                    break;
                } else {
                    System.out.print(a+" ");
                    a = a + 2;
                }
            }
            else if (a%2 == 1 && b%2 == 0){
                if (a==b-1){
                    System.out.println(a);
                    break;
                } else {
                    System.out.print(a+" ");
                    a = a + 2;
                }
            }
            else if (a%2 == 0 && b%2 == 1){
                if (a==b-1){
                    System.out.println(b);
                    break;
                } else {
                    a = a + 1;
                    System.out.print(a+" ");
                    a = a + 1;
                }
            }
            else if (a%2 == 0 && b%2 == 0){
                if (a==b-2){
                    a = a + 1;
                    System.out.println(a);
                    break;
                } else {
                    a = a + 1;
                    System.out.print(a+" ");
                    a = a + 1;
                }
            }
        }
    }
}