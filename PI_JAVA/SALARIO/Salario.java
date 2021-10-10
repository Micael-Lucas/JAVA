import java.util.Scanner;

public class Salario
{
    public static void main(String[] args)
    {
        float vhora, percDes, totBruto, valorDesc, valorLiq;
        int qtdeHoras;

        Scanner scan = new Scanner(System.in);

        vhora = scan.nextFloat();
        qtdeHoras = scan.nextInt();
        percDes = scan.nextFloat();

        totBruto = vhora * qtdeHoras;
        valorDesc = (percDes*totBruto)/100f;
        valorLiq = totBruto - valorDesc;

        System.out.printf("%.2f\n", valorLiq);
    }
}