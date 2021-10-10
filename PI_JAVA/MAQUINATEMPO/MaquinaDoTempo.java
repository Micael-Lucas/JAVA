import java.util.Scanner;

public class MaquinaDoTempo
{
    public static void main(String[] args)
    {
        int a, b, c;

        Scanner scan = new Scanner(System.in);

        a =  scan.nextInt();
        b =  scan.nextInt();
        c =  scan.nextInt();

        if (a == b || a == c || b == c){
            System.out.println("S");
        }
        else if (a + c == b || a + b == c || b + c == a){
            System.out.println("S");
        }
        else {
            System.out.println("N");
        }
    }
}