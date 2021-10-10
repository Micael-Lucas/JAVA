import java.util.Scanner;



public class NotaDeCorte {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numAlunos = scan.nextInt();
        int numMedia = scan.nextInt();
        int notas[] = new int[numAlunos];
        int soma = 0;
        int media;

        for (int i=0; i<numAlunos; i++){
            notas[i]=scan.nextInt();
        }


        bubbleSort(notas, numAlunos);

        for (int i=numAlunos - numMedia; i<numAlunos; i++){
            soma = notas[i] + soma;
        }

        media = soma/numMedia;

        System.out.println(media);

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