import java.util.Scanner;

public class NotasEMedia
{
    public static void main(String[] args)
    {
        int count;
        float nota, input;

        Scanner scan = new Scanner(System.in);

        count = 0;
        nota = 0;

        while (count<10){
            count = count + 1;
            System.out.println("Informe a " + count + "a. nota:");
            input = scan.nextFloat();
            nota = nota + input;
        }

        System.out.printf("Sua Media Final dos Trabalhos (NFT) foi %.2f\n", (nota / 10f));
    }
}