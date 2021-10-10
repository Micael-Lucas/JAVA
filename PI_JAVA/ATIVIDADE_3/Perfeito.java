import java.util.Scanner;

public class Perfeito
{
    public static void main(String args[])
    {
        int num;

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        if (ehPerfeito(num)){
            System.out.println("SIM");
        }
        else {
            System.out.println("NAO");
        }
    }

    static boolean ehPerfeito(int num){
        int soma, contador;

        soma = 0;
        contador = num - 1;

        while(contador != 0){
            if (num%contador == 0){
                soma = soma + contador;
                contador = contador - 1;
            }
            else{
                contador = contador - 1;
            }
        }

        if (soma == num){
            return true;
        }

        return false;
    }
}
