import java.util.Scanner;

public class Soma100
{
    public static void main(String[] args)
    {
        int multiplicador, soma;

        soma = 0;
        multiplicador = 1;

        while (multiplicador < 101){
            soma = soma + multiplicador;

            multiplicador = multiplicador + 1;
        }

        System.out.println(soma);
    }
}