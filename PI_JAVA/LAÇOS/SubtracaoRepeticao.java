import java.util.Scanner;

public class SubtracaoRepeticao
{
    public static void main(String[] args)
    {
        int a, b, count, dif;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        count = 0;

        while (count < b){
            count = count + 1;
        }

        dif = 0;

        while (count < a){
            count = count + 1;
            dif = dif + 1;
        }

        System.out.println(dif);
    }
}