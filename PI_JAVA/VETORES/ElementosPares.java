import java.util.Scanner;

public class ElementosPares {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = scan.nextInt();
        int count = 0, a = 0;
        boolean minimoPar = false;

        int tamanhoVetorPares = 0;

        int[] vetor = new int[tamanhoVetor];
        int[] vetorPares = new int[tamanhoVetor];

        for(int i=0; i<tamanhoVetor; i++){
            vetor[i] = scan.nextInt();
        }

        while(a < tamanhoVetor){

            if (vetor[a]%2 == 0){
                vetorPares[count] = vetor[a];
                count = count + 1;
                minimoPar = true;
                tamanhoVetorPares = tamanhoVetorPares + 1;

            a = a + 1;
            }
        }

        if (minimoPar == false){
            System.out.println("0");
        }
        else{
            for(int g=0; g < tamanhoVetorPares; g++){
                if (g <= tamanhoVetor - 2){
                System.out.print(vetorPares[g] + " ");
                }
                else if (g == tamanhoVetor - 1){
                    System.out.println(vetorPares[g]);
                }
            }
        }
    }
}