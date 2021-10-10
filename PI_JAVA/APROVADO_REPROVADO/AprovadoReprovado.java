import java.util.Scanner;

public class AprovadoReprovado
{
    public static void main(String[] args)
    {
        double nota;

        Scanner scan = new Scanner(System.in);

        nota = scan.nextFloat();

        if (nota >= 60d){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }
    }
}