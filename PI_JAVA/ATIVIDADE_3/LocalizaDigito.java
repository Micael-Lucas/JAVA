import java.util.Scanner;

public class LocalizaDigito
{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int  n = scan.nextInt();
        int  k = scan.nextInt();

        while(n!=0){
            System.out.println(localizaDig(n,k));
            n = scan.nextInt();
            if (n==0){
                break;
            }
            k = scan.nextInt();
        }
    }

    static int localizaDig(int n, int k){
        int soma = 1;
        int resultado = 0;

        while(soma < k){
            n = n/10;
            soma = soma + 1;
        }

        resultado = n % 10;

        return resultado;

    }
}
