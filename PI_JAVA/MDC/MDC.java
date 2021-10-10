import java.util.Scanner;

public class MDC
{
    public static void main(String[] args)
    {
        int a, b, count;
        boolean verificador, mdc;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        verificador = a>b;
        mdc = false;

        if (verificador == true){
            count = b;
            while (mdc != true){
                if (a%count == 0 && b%count == 0){
                    mdc = true;
                }
                else{
                    count = count - 1;
                }
            }
        }
        else{
            count = a;
            while (mdc != true){
                if (a%count == 0 && b%count == 0){
                    mdc = true;
                }
                else{
                    count = count - 1;
                }
            }
        }

        System.out.println(count);


    }
}