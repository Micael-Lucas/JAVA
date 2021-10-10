import java.util.Scanner;

public class Lua
{
    public static void main(String[] args)
    {
        int diaUm, diaDois;
        boolean maior, menor;

        Scanner scan = new Scanner(System.in);

        diaUm = scan.nextInt();
        diaDois = scan.nextInt();

        maior = diaUm < diaDois;

        if (maior==true){
            if (diaDois <= 2){
               System.out.println("Nova");
            }

            else if (diaDois > 2 && diaDois <97){
                System.out.println("Crescente");
            }

            else if (diaDois >= 97){
                System.out.println("Cheia");
            }
        }

        if (maior == false){
            if (diaDois <= 2){
                System.out.println("Nova");
            }

            else if (diaUm > 2 && diaUm<=97){
                System.out.println("Minguante");
            }
            else if (diaDois >= 97){
                System.out.println("Cheia");
            }
        }

    }
}