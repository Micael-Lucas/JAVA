import java.util.Scanner;

public class RestoDivisaoRepeticao
{
    public static void main(String[] args)
    {
        int a, b, count, numA, resto;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        count = 0;
        numA = a;

        while (a != numA%b){
            a = a - b;
            count = count + 1;
        }

        resto = numA - (count*b);

        System.out.println(resto);
    }
}