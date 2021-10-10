import java.util.Scanner;

public class DiagonalSecundaria {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tamanho = scan.nextInt();

        int matriz[][] = new int[tamanho][tamanho];

        for (int i=0; i<tamanho; i++){
            for (int a=0; a<tamanho; a++){
                matriz[i][a] = scan.nextInt();
            }
        }

        int tam = tamanho - 1;
        int lin = 0;

        while(tam > -1){
            System.out.println(matriz[lin][tam]);
            lin = lin + 1;
            tam = tam - 1;
        }
    }
}