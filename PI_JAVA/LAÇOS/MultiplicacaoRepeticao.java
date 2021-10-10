import java.util.Scanner;

public class MultiplicacaoRepeticao
{
    public static void main(String[] args)
    {
        int a, b, count, numA;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        count = 0;
        numA = a;

        if (a==0 || b==0){
            System.out.println(0);
        }
        else{
            while (count < b-1){
                a = a + numA;
                count = count + 1;
            }

            System.out.println(a);

        }
    }
}