import java.util.Scanner;

public class EliminaRepete {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int qtdnum = scan.nextInt();
        int comprada = 0;
        boolean repetida = false;

        int compradas[] = new int[qtdnum];

        for (int a = 0; a<qtdnum; a++){
            compradas[a] = -50;
        }

        for (int a = 0; a<qtdnum; a++){
            comprada = scan.nextInt();
            for (int i = 0; i<qtdnum; i++){
                if (comprada == compradas[i]){
                    repetida = true;
                }
            }

            if (repetida == false){
                compradas[a] = comprada;
            }

            repetida = false;
        }

        int contagem = 1;

        for (int i = 0; i<qtdnum; i++){
            if (compradas[i] != -50 && contagem == 1){
                System.out.print(compradas[i]);
                contagem = 2;
            }
            else if (compradas[i] != -50){
                System.out.print(" " + compradas[i]);
            }
        }

        System.out.println("");

    }
}