import java.util.Scanner;

public class AprovadoReprovado2
{
    public static void main(String[] args)
    {
        double nota1, nota2, media;

        Scanner scan = new Scanner(System.in);

        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();

        media = (nota1 + nota2)/2;

        if (media >= 60d){
            System.out.println("APROVADO");
        }
        else if (media >= 40d){
            System.out.println("EXAME FINAL");
        }
        else{
            System.out.println("REPROVADO");
        }
    }
}