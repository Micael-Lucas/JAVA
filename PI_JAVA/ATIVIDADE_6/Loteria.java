import java.util.Scanner;

public class Loteria {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nApostas = scan.nextInt();

        int matriz[][] = new int[nApostas][6];

        for (int i = 0; i<nApostas; i++){
            for (int a = 0; a<6 ; a++){
                matriz[i][a] = scan.nextInt();
            }
        }

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        int n5 = scan.nextInt();
        int n6 = scan.nextInt();

        int i = 0;

        int acertos = 0;

        int quadra = 0, quina = 0, sena = 0;


        while(i<nApostas){

            acertos = 0;

            for (int a=0; a<6; a++){
                if (matriz[i][a] == n1 || matriz[i][a] == n2 || matriz[i][a] == n3 || matriz[i][a] == n4 || matriz[i][a] == n5 || matriz[i][a] == n6){
                    acertos = acertos + 1;
                }
            }

            if (acertos == 6){
                sena = sena + 1;
            }

            else if(acertos == 5){
                quina = quina + 1;
            }

            else if(acertos == 4){
                quadra = quadra + 1;
            }

            i = i + 1;

        }


        if (sena > 0){
            System.out.println("Houve "+ sena +" acertador(es) da sena");
        }

        else {
            System.out.println("Nao houve acertador para sena");
        }

        if (quina > 0){
            System.out.println("Houve "+ quina +" acertador(es) da quina");
        }

        else {
            System.out.println("Nao houve acertador para quina");
        }

        if (quadra > 0){
            System.out.println("Houve "+ quadra +" acertador(es) da quadra");
        }

        else {
            System.out.println("Nao houve acertador para quadra");
        }


    }
}