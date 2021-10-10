import java.util.Scanner;

public class ResumoIntervalo
{
    public static void main(String[] args)
    {
        int a, b, seteMult, salvaA;
        double media, af, bf;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();

        salvaA = a;

        while (a < b){
            if (a == b - 1){
                System.out.print(a + " ");
                System.out.println(b);
                a = a + 1;
            }
            else {
                System.out.print(a + " ");
                a = a + 1;
            }
        }

        a = salvaA;
        seteMult = 0;

        while (a <= b){
            if (a%7 == 0 && a != 0){
                seteMult = seteMult + 1;
                a = a + 1;
            }
            else{
                a = a + 1;
            }
        }

        a = salvaA;

        System.out.println("entre " + a + " e " + b + " existe(m) " + seteMult + " numero(s) divisiveis por 7.");

        af = (float) a;
        bf = (float) b;
        media = (a + b)/2d;

        System.out.printf(media);
        System.out.printf("a media aritmetica simples de todos os valores entre %d e %d eh %.2d.\n", a,b,media);
        System.out.printf(media);
    }
}