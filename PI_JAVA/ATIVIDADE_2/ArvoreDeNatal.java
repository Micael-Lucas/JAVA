import java.util.Scanner;

public class ArvoreDeNatal
{
    public static void main(String[] args)
    {

        int alt, diam, galhos, repeticoes, count;

        Scanner scan = new Scanner(System.in);

        repeticoes = scan.nextInt();

        count = 1;

        while (count <= repeticoes){
            alt = scan.nextInt();
            diam = scan.nextInt();
            galhos = scan.nextInt();

            if (alt >= 200 && alt <= 300 && diam >= 50 && galhos >= 150){
                System.out.println("Sim");
                count = count + 1;
            }
            else {
                System.out.println("Nao");
                count = count + 1;
            }
        }

    }
}