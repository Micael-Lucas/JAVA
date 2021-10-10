import java.util.Scanner;

public class SomaRepeticao
{
    public static void main(String[] args)
    {
        int a, b, count, countum;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        count = 0;

        while (count < a){
            count = count + 1;
        }

        countum = count;

        while (count < b + countum){
            count = count + 1;
        }

        System.out.println(count);

    }
}