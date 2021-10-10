import java.util.Scanner;

public class SomaMatDir {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tam = scan.nextInt();
        int dobroTam = tam*2;

        int matA[][] = new int[tam][tam];
        int matB[][] = new int[tam][tam];

        int matriz[][] = new int[dobroTam][dobroTam];

        for (int i=0; i<tam; i++){
            for (int a=0; a<tam; a++){
                matA[i][a] = scan.nextInt();
            }
        }

        for (int i=0; i<tam; i++){
            for (int a=0; a<tam; a++){
                matB[i][a] = scan.nextInt();
            }
        }

        for (int i=0; i<dobroTam; i++){
            for (int a=0; a<dobroTam; a++){
                matriz[i][a] = 0;
            }
        }

        for (int i=0; i<tam; i++){
            for (int a=0; a<tam; a++){
                matriz[i][a] = matA[i][a];
            }
        }

        for (int i=tam; i<dobroTam; i++){
            for (int a=tam; a<dobroTam; a++){
                matriz[i][a] = matB[i-tam][a-tam];
            }
        }

        for (int i = 0; i<dobroTam; i++){
            for (int a = 0; a<dobroTam ; a++){
                if (a == dobroTam - 1){
                    System.out.println(matriz[i][a]);
                }
                else{
                    System.out.print(matriz[i][a] + " ");
                }
            }
        }

    }
}