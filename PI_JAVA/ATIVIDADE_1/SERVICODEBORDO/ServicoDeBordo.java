import java.util.Scanner;

public class ServicoDeBordo
{
    public static void main(String[] args)
    {
        int qtdeFran, qtdeMassa, qtdeBife, pedFran, pedMassa, pedBife, total, qtdeF, qtdeM, qtdeB;

        Scanner scan = new Scanner(System.in);

        qtdeFran = scan.nextInt();
        qtdeMassa = scan.nextInt();
        qtdeBife = scan.nextInt();

        pedFran = scan.nextInt();
        pedMassa = scan.nextInt();
        pedBife = scan.nextInt();

        qtdeF = 0;
        qtdeM = 0;
        qtdeB = 0;


        if (qtdeFran<pedFran){
            qtdeF = pedFran - qtdeFran;
        }

        if (qtdeMassa<pedMassa){
            qtdeM = pedMassa - qtdeMassa;
        }

        if (qtdeBife<pedBife){
            qtdeB = pedBife - qtdeBife;
        }

        total = qtdeF + qtdeM + qtdeB;

        System.out.println(total);
    }
}