import java.util.Scanner;

public class Procon
{
    public static void main(String[] args)
    {
        int qtde, ponto, count, dif;

        Scanner scan = new Scanner(System.in);

        count = 0;
        ponto = 0;

        qtde = scan.nextInt();

        while (qtde != 0){
            if (qtde<=58){
                ponto = ponto + 1;
                count = count + 1;
            }
            else {
                count = count + 1;
            }

            qtde = scan.nextInt();
        }

        dif = count - ponto;

        if ((dif*100)/count >= 98){
            System.out.println("Lote Aprovado");
        }
        else {
            System.out.println("Lote Rejeitado");
        }
    }
}