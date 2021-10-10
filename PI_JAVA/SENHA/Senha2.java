import java.util.Scanner;

public class Senha2
{
    public static void main(String[] args)
    {
        int senha, unidade, dezena, centena, milhar;
        float verificacao;

        Scanner scan = new Scanner(System.in);

        senha = scan.nextInt();

        unidade = senha%10;
        dezena = ((senha - unidade)/10)%10;
        centena = ((senha - (dezena*10) - unidade)/100)%10;
        milhar = ((senha - (centena*100) - (dezena*10) - unidade)/1000)%10;

        verificacao = senha / 1000;

        if (verificacao >= 1 && verificacao < 10){
            if (unidade != dezena && unidade != centena && unidade != milhar && dezena != centena &&  dezena != milhar && centena != milhar){
                System.out.println("SIM");
            }
            else {
                System.out.println("NAO");
            }
        }
    }
}