import java.util.Scanner;

public class Quermesse
{
    public static void main(String[] args)
    {

        int part, pos;
        int contaTestes, count, ganhador;

        Scanner scan = new Scanner(System.in);

        ganhador = 0;
        contaTestes = 1;
        count = 1;

        part = scan.nextInt();

        while (part != 0){

            while (count<=part){
                pos = scan.nextInt();

                if (count == pos){
                    ganhador = pos;
                }

                count = count + 1;
            }

            System.out.println("Teste " + contaTestes);
            System.out.println(ganhador);
            System.out.println();

            contaTestes = contaTestes + 1;
            count = 1;
            part = scan.nextInt();

        }

    }
}