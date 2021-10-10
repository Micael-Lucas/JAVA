import java.util.Scanner;

public class Numeros100
{
    public static void main(String[] args)
    {
        int count;
        Scanner scan = new Scanner(System.in);

        count = 0;

        while(count<101){
            if (count==100){
                System.out.println(count);
                count = count + 1;
            }
            else{
                System.out.print(count+" ");
                count = count + 1;
            }
        }
    }
}