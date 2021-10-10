import java.util.Scanner;

public class Borboletas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tam = scan.nextInt();
        int nLoc = tam*2;
        int lo = 0;

        int matriz[][] = new int[tam][tam];
        int locais[][] = new int[nLoc][2];

        for (int i=0; i<tam; i++){
            for (int a=0; a<tam; a++){
                matriz[i][a] = scan.nextInt();
            }
        }

        for (int i=0; i<nLoc; i++){
            for (int a=0; a<2; a++){
                lo = scan.nextInt();
                lo = lo - 1;
                locais[i][a] = lo;
            }
        }

        int j = 0, espDif = 0, especie = 0;
        int livro[] = new int[1001];
        boolean repetida = false;

        for (int i=0; i<1001; i++){
            livro[i] = 0;
        }

        for (int i=0; i<nLoc; i++){
            especie = matriz[locais[i][0]][locais[i][1]];

            for (int a=0; a<1001; a++){
                if (especie == livro[a]){
                    repetida = true;
                }
            }

            if (repetida == false){
                livro[j] = especie;
                espDif = espDif + 1;
                j = j + 1;
            }

            repetida = false;
        }

        System.out.println(espDif);
    }
}