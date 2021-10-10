import java.util.Scanner;

public class NumerosPares100
{
    public static void main(String[] args)
    {
        int count;
        Scanner scan = new Scanner(System.in);

        count = 0;

        while(count!=100){
            if (count==98){
                count = count + 2;
                System.out.println(count);
            }
            else{
                count = count + 2;
                System.out.print(count+" ");
            }
        }
    }
}