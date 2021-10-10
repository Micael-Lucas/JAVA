import java.util.Scanner;

public class Ampulheta2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tamanho = scan.nextInt();
        int maior = 0, j = 0;

        int matriz[][] = new int[tamanho][tamanho];
        int soma[] = new int[100000];

        for (int i=0; i<100000; i++){
            soma[i] = -100;
        }

        for (int i=0; i<tamanho; i++){
            for (int a=0; a<tamanho; a++){
                matriz[i][a] = scan.nextInt();
            }
        }

        for (int i=0; i<tamanho-2; i++){
            for (int a=0; a<tamanho-2; a++){
                soma[j] = matriz[i][a] + matriz[i][a + 1] + matriz[i][a + 2] + matriz[i + 1][a + 1] + matriz[i + 2][a] + matriz[i + 2][a + 1] + matriz[i + 2][a + 2];
                j = j + 1;
            }
        }

        for (int i=0; i<100000; i++){
            if (i==0){
                maior = soma[i];
            }
            else if (soma[i]>maior){
                maior = soma[i];
            }
        }

        System.out.println(maior);
    }
}