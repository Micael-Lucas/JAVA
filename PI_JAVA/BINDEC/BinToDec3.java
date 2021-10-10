import java.util.Scanner;

public class BinToDec3
{
    public static void main(String[] args)
    {
        long numBin, numDec, tiraFinal;
        double soma, count;

        Scanner scan = new Scanner(System.in);

        numBin = scan.nextLong();

        count = 0;
        soma = 0;

        while (numBin != 0){
            tiraFinal = numBin%10;
            soma = soma + (tiraFinal * Math.pow(2,count));

            numBin = numBin/10;
            count = count + 1;
        }

        numDec = (int) soma;

        System.out.println(numDec);

    }
}