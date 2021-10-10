import java.util.Scanner;

public class BinToDec
{
    public static void main(String[] args)
    {
        long bin;

        Scanner scan = new Scanner(System.in);

        bin = 0;
        while(scan.hasNext()){
            bin = scan.nextLong();
            System.out.println(binToDec(bin));
        }
    }

    static int binToDec(long numBin){
        double soma, count;
        long tiraFinal;
        int numDec;

        count = 0;
        soma = 0;

        while (numBin != 0){
            tiraFinal = numBin%10;
            soma = soma + (tiraFinal * Math.pow(2,count));

            numBin = numBin/10;
            count = count + 1;
        }

        numDec = (int) soma;

        return numDec;
    }
}