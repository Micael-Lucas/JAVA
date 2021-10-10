import java.util.Scanner;

public class Triangulo2
{
    public static void main(String[] args)
    {
        float angUm, angDois, angTres;

        Scanner scan = new Scanner(System.in);

        angUm = scan.nextFloat();
        angDois = scan.nextFloat();

        angTres = 180f - angUm - angDois;

        if (angUm < 90f && angDois < 90f && angTres < 90f){
            System.out.println("acutangulo");
        }
        else if (angUm > 90f || angDois > 90f || angTres > 90f){
            System.out.println("obtusangulo");
        }
        else {
             System.out.println("retangulo");
        }


    }
}