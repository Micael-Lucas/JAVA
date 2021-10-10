import java.util.Scanner;

public class Senha
{
    public static void main(String[] args)
    {
        int senha, unidade, dezena, centena, milhar;

        Scanner scan = new Scanner(System.in);

        senha = scan.nextInt();

        unidade = senha%10;
        dezena = ((senha - unidade)/10)%10;
        centena = ((senha - (dezena*10) - unidade)/100)%10;
        milhar = ((senha - (centena*100) - (dezena*10) - unidade)/1000)%10;

        if (unidade == 0 || dezena == 0 || centena == 0 || milhar == 0){
            System.out.println("NAO");
        }
        else{
            System.out.println("SIM");
        }
    }
}