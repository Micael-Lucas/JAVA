import java.util.Scanner;

public class Espelho
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int A, B;

        A = scan.nextInt();
        B = scan.nextInt();

        if (ehEspelho(A,B)){
            System.out.println("espelho");
        }
        else {
            System.out.println("nao espelho");
        }
    }

    static boolean ehEspelho(int A, int B){
        int Aquatro = A%10;
        A = A/10;
        int Atres = A%10;
        A = A/10;
        int Adois = A%10;
        A = A/10;
        int Aum = A%10;

        int Bquatro = B%10;
        B = B/10;
        int Btres = B%10;
        B = B/10;
        int Bdois = B%10;
        B = B/10;
        int Bum = B%10;

        if (Bum == Aquatro && Bdois == Atres && Btres == Adois && Bquatro == Aum){
            return true;
        }
        else{
            return false;
        }
    }
}
