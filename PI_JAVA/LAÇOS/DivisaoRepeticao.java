import java.util.Scanner;

public class DivisaoRepeticao
{
    public static void main(String[] args)
    {
        int a, b, count, numA;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        count = 0;
        numA = a;

        while (a != numA%b){
            a = a - b;
            count = count + 1;
        }

        System.out.println(count);
    }
}