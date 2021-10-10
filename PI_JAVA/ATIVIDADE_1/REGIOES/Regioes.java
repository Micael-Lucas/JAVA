import java.util.Scanner;

public class Regioes
{
    public static void main(String[] args)
    {
        int num, count, umaum;

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        count = 1;
        umaum = 0;

        while (umaum != num+1){
            count = count + umaum;
            umaum = umaum + 1;
        }

        System.out.println(count);
    }
}