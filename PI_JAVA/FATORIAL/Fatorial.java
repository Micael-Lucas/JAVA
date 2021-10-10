import java.util.Scanner;

public class Fatorial
{
    public static void main(String[] args)
    {
        long count, mult, fatores;

        Scanner scan = new Scanner(System.in);

        fatores = scan.nextInt();
        count = 0;
        mult = 1;

        while(count<fatores){
            mult = mult * (count+1);
            count = count + 1;
        }

        System.out.println(mult);
    }
}