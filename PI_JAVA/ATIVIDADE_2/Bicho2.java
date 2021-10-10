import java.util.Scanner;

public class Bicho2
{
    public static void main(String[] args)
    {
        long entrada, count, resultado, soma;

        Scanner scan = new Scanner(System.in);

        count = 1;
        entrada = 0;
        soma = 0;

        while(count<=5){
            entrada = scan.nextLong();
            soma = soma + entrada;
            count = count + 1;
        }


        resultado = soma%10000;


        if (resultado/1000d >= 1){
            System.out.println(resultado);
        }
        else if (resultado/1000d >= 0.1){
            System.out.println("0" + resultado);
        }
        else if (resultado/1000d >= 0.01){
            System.out.println("00" + resultado);
        }
        else if (resultado/1000d >= 0){
            System.out.println("000" + resultado);
        }

    }
}