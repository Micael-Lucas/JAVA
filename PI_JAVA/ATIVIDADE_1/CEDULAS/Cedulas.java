import java.util.Scanner;

public class Cedulas
{
    public static void main(String[] args)
    {
        int Valor, cem, cinq, vinte, dez, cinco, dois, um;
        int cemSobra, cinqSobra, vinteSobra, dezSobra, cincoSobra, doisSobra;

        Scanner scan = new Scanner(System.in);

        Valor = scan.nextInt();

        cem = Valor/100;
        cemSobra = Valor%100;

        cinq = cemSobra/50;
        cinqSobra = cemSobra%50;

        vinte = cinqSobra/20;
        vinteSobra = cinqSobra%20;

        dez = vinteSobra/10;
        dezSobra = vinteSobra%10;

        cinco = dezSobra/5;
        cincoSobra = dezSobra%5;

        dois = cincoSobra/2;
        doisSobra = cincoSobra%2;

        um = doisSobra;

        System.out.println("R$"+Valor+".00");
        System.out.println(cem +" nota(s) de R$100.00");
        System.out.println(cinq +" nota(s) de R$50.00");
        System.out.println(vinte +" nota(s) de R$20.00");
        System.out.println(dez +" nota(s) de R$10.00");
        System.out.println(cinco +" nota(s) de R$5.00");
        System.out.println(dois +" nota(s) de R$2.00");
        System.out.println(um +" nota(s) de R$1.00");
    }
}