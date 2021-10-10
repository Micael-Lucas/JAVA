import java.util.Scanner;

public class Chocolate
{
    public static void main(String[] args)
    {

        int numCortes, soma, qtdeCortes, count;

        Scanner scan = new Scanner(System.in);

        numCortes = scan.nextInt();
        soma = 0;
        count = 1;

        while (count <= numCortes){
            qtdeCortes = scan.nextInt();

            soma = soma + (qtdeCortes - 1);
            count = count + 1;
        }

        System.out.println(soma);
    }
}