import java.util.Scanner;

public class Idade
{
    public static void main(String args[])
    {
        int anoAtual, anoNascimento, idade;
        String nome;

        Scanner scan = new Scanner(System.in);

        anoAtual = scan.nextInt();
        nome = scan.next();
        anoNascimento = scan.nextInt();

        idade = anoAtual - anoNascimento;

        System.out.println(nome +", voce completa " + idade + " anos de idade neste ano.");
    }
}