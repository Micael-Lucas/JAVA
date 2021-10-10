import java.util.Scanner;

public class Primo
{
    public static void main(String args[])
    {
        int num;

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        if(ehPrimo(num)){
            System.out.println("PRIMO");
        }
        else{
            System.out.println("COMPOSTO");
        }
    }

    public static boolean ehPrimo(int nume){
        int count = num - 1;

        boolean resultado = true;
        if (num == 1){
            resultado = false;
        }

        while (count > 1){
            if (num%count == 0){
                resultado = false;
                break;
            }
            else{
                count = count - 1;
            }
        }
        return resultado;
    }
}


