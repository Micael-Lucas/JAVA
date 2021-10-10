import java.util.Scanner;

public class Pacman{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tamanho = scan.nextInt();

        int sTam = tamanho;

        int resultado = 0, comida = 0, j=0, maior=0;

        int salvaC[] = new int[10001];

        for(int i=0; i<10001; i++){
            salvaC[i] = 0;
        }

        char tabuleiro[][] = new char[tamanho][tamanho];

        for (int i=0; i<tamanho; i++){
            String linha = scan.next();
            for (int a=0; a<tamanho; a++){
                tabuleiro[i][a] = linha.charAt(a);
            }
        }

        for (int i=0; i<tamanho; i++){
            if (i%2 == 0){
                for (int a=0; a<tamanho; a++){
                    if (tabuleiro[i][a] == 'A'){
                        salvaC[j] = comida;
                        comida = 0;
                        j = j + 1;
                    }

                    if (tabuleiro[i][a] == 'o'){
                        comida = comida + 1;
                    }
                }
            }

            else if (i%2 == 1){
                for (sTam = tamanho - 1; sTam>-1; sTam--){


                    if (tabuleiro[i][sTam] == 'A'){
                        salvaC[j] = comida;
                        comida = 0;
                        j = j + 1;
                    }

                    if (tabuleiro[i][sTam] == 'o'){
                        comida = comida + 1;
                    }
                }
            }
        }

        salvaC[j] = comida;

        for (int i=0; i<10001; i++){
            if (i==0){
                maior = salvaC[i];
            }
            else if(salvaC[i]>maior){
                maior = salvaC[i];
            }
        }
        System.out.println(maior);
    }
}