import java.util.Scanner;

public class Maior
{
    public static void main(String[] args)
    {
        int a,b,c;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a<b && c<b){
            System.out.println(b + " eh o maior.");
        }
        else if (a<c && b<c){
            System.out.println(c + " eh o maior.");
        }
        else {
            System.out.println(a + " eh o maior.");
        }

    }
}