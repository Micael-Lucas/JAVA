import java.util.Scanner;

public class Ufabc
{
    public static void main(String args[])
    {
        char letra;

        Scanner scan = new Scanner(System.in);

        letra = scan.next().charAt(0);

        System.out.println(convConceitoUfabc(letra));

    }

    static char convConceitoUfabc(char letra){
        switch(letra){
            case 'A':
                return 'F';
            default:
                return 'A';
        }
    }

}
