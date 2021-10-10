import java.util.Scanner;

public class SalarioComissionado
{
    public static void main(String[] args)
    {

        float salFix, valVendas, percComi, adicional, salarioTot;
        Scanner scan = new Scanner(System.in);

        salFix = scan.nextFloat();
        valVendas = scan.nextFloat();
        percComi = scan.nextFloat();

        adicional = (valVendas * percComi)/100f;
        salarioTot = adicional + salFix;

        System.out.printf("%.2f\n", salarioTot);
    }
}
