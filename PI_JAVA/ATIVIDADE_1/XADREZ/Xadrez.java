import java.util.Scanner;

public class Xadrez
{
    public static void main(String[] args)
    {
        int col, lin;

        Scanner scan = new Scanner(System.in);

        col = scan.nextInt();
        lin = scan.nextInt();

        if (col%2 == 1 && lin%2 == 1){
            System.out.println("1");
        }

        else if (col%2 == 0 && lin%2 == 0){
            System.out.println("1");
        }

        else{
            System.out.println("0");
        }
    }
}