import java.util.Scanner;

public class Carteiro {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tempo = 0;

        int nCasas = scan.nextInt();
        int nEnco = scan.nextInt();

        int casas[] = new int[nCasas];
        int enco[] = new int[nEnco];
        int posicoes[] = new int[nEnco];

        for(int i=0; i<nCasas; i++){
            casas[i] = scan.nextInt();
        }

        for(int i=0; i<nEnco; i++){
            enco[i] = scan.nextInt();
        }

        for(int i=0; i<nEnco; i++){
            for(int x=0; x<nCasas; x++){

                if(enco[i] == casas[x]){
                    posicoes[i] = x;
                    break;
                }
            }
        }

        tempo = tempo + posicoes[0];
        int resultado = 0;

        for(int i=0; i<nEnco-1; i++){
            resultado = posicoes[i] - posicoes[i+1];

            if (resultado<0){
                resultado = resultado * -1;
            }

            tempo = tempo + resultado;
        }

        System.out.println(tempo);


    }
}