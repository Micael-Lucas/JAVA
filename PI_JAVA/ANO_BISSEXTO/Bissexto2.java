import java.util.Scanner;

public class Bissexto2
{
    public static void main(String[] args)
    {
        int entrada;

        Scanner scan = new Scanner(System.in);

        entrada = scan.nextInt();

        if (entrada%400 == 0){
            System.out.println("ANO BISSEXTO");
        }

        else if (entrada%100 == 0){

        }
        else if (entrada%4 == 0){
            System.out.println("ANO BISSEXTO");
        }
    }
}