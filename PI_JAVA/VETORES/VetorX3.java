import java.util.Scanner;

public class VetorX3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int tamanhoVetor = sc.nextInt();

        int[] vetor = new int[999];
        int[] numero = new int[999];

        for (int i=0; i < tamanhoVetor; i++){
            vetor[i] = sc.nextInt();
            numero[i] = vetor[i] * 3;
        }

        for (int a=0; a < tamanhoVetor ; a++){
            if (a <= tamanhoVetor - 2){
                System.out.print(numero[a] + " ");
            }
            else if (a == tamanhoVetor - 1){
                System.out.println(numero[a]);
            }
        }
    }
}