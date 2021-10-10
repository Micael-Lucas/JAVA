import java.util.Scanner;

public class Crescimento
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double testes, count, popA, popB;
        double cresA, cresB;
        int anos;

        testes = scan.nextDouble();
        count = 1;
        anos = 0;
        popA = 0;
        popB = 0;
        cresA = 0;
        cresB = 0;

        while (count <= testes){

            popA = scan.nextDouble();
            popB = scan.nextDouble();
            cresA = scan.nextDouble();
            cresB = scan.nextDouble();

            while (popA <= popB){
                popA = popA + (popA*(cresA/100d));
                popB = popB + (popB*(cresB/100d));
                anos = anos + 1;

                if (anos > 100){
                    popA = popB + 1;
                }
            }

            if (anos > 100){
                System.out.println("Mais de 1 seculo.");
            }
            else{
                System.out.println(anos + " anos.");
            }

            anos = 0;
            count = count + 1;
        }


    }
}