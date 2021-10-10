import java.util.Scanner;

public class Telescopio
{
    public static void main(String[] args)
    {
        long areaTel, fotons, qtdeEstrelas, count;
        int contaEstrelas;

        Scanner scan = new Scanner(System.in);

        areaTel = scan.nextLong();
        qtdeEstrelas = scan.nextLong();

        count = 0;
        contaEstrelas = 0;

        while (count < qtdeEstrelas){
            fotons = scan.nextLong();

            if (fotons*areaTel >= 40000000){
                contaEstrelas = contaEstrelas + 1;
            }

            count = count + 1;
        }

        System.out.println(contaEstrelas);

    }
}