import java.util.Scanner;

public class Soma2{
    public static void main(String args[]){
        int num;

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        System.out.println(somador(num));
    }

    public static int somador(int num){
        Scanner scan = new Scanner(System.in);

        int resultado, pSomar, count = 1;

        resultado = 0;
        pSomar = 0;
        int numtrav = num;
        num = num + 1;

        while (count<=numtrav){
            pSomar = num - 1;

            num = pSomar;

            resultado = pSomar + resultado;

            count = count + 1;
        }

        return resultado;
    }
}