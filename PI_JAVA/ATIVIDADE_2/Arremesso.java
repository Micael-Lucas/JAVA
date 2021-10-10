import java.util.Scanner;

public class Arremesso
{
    public static void main(String[] args)
    {
        long numero, resultado, tirafinal, count;

        Scanner scan = new Scanner(System.in);

        count = 1;
        numero = 0;
        resultado = 1;
        tirafinal = 0;

        while (count <= 5){
            numero = scan.nextLong();

            if (count == 1){
                resultado = numero;
            }
            else if (count == 2){
                resultado = resultado * numero;
            }

            count = count + 1;
        }

        String conta = Long.toString(resultado);
        int numChar = conta.length();

        if (numChar == 8){
            resultado = resultado / 1000l;
            resultado = resultado%1000;
            if (resultado < 10){
                System.out.println("00"+resultado);
            }
            else if (resultado <100){
                System.out.println("0"+resultado);
            }
            else {
                System.out.println(resultado);
            }
        }

        else if (numChar == 7){
            resultado = resultado / 1000l;
            resultado = resultado%1000;
            if (resultado < 10){
                System.out.println("00"+resultado);
            }
            else if (resultado <100){
                System.out.println("0"+resultado);
            }
            else {
                System.out.println(resultado);
            }
        }

        else if (numChar == 6){
            resultado = resultado / 1000l;
            resultado = resultado%1000;
            if (resultado < 10){
                System.out.println("00"+resultado);
            }
            else if (resultado <100){
                System.out.println("0"+resultado);
            }
            else {
                System.out.println(resultado);
            }
        }

        else if (numChar == 5){
            resultado = resultado / 1000l;
            resultado = resultado%1000;
            if (resultado < 10){
                System.out.println("00"+resultado);
            }
            else if (resultado <100){
                System.out.println("0"+resultado);
            }
            else {
                System.out.println(resultado);
            }
        }

        else if (numChar == 4){
            resultado = resultado / 1000l;
            resultado = resultado%1000;
            System.out.println("00"+resultado);
        }

        else if (numChar <= 3){
            System.out.println("000");
        }


    }
}