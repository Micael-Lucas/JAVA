import java.util.Scanner;

public class Mediana {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int qtdNum = scan.nextInt();
        int posicao;

        int numeros[] = new int[qtdNum];

        for (int i=0; i<qtdNum; i++){
            numeros[i] = scan.nextInt();
        }

        bubbleSort(numeros, qtdNum);

        if (qtdNum%2 == 1){
            posicao = qtdNum/2;
            System.out.println(numeros[posicao]+".00");
        }

        else{
            posicao = qtdNum/2;
            int n1 = numeros[posicao];
            int n2 = numeros[posicao - 1];
            float n1f = (float)n1;
            float n2f = (float)n2;

            float media = (n1f + n2f)/2f;

            System.out.printf("%.2f\n", media);
        }
    }

    public static void bubbleSort(int[] v, int n){
        int i, j, aux;

        for(i=0; i<n-1; i++){
            for(j=0; j<n-1-i; j++){
                if(v[j] > v[j+1]){
                    aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
}