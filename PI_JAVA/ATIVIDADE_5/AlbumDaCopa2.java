import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AlbumDaCopa2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tamanho = scan.nextInt();

        int qtdCompradas = scan.nextInt();
        int count = 0;
        boolean repetida = false;
        int comprada = 0;

        int compradas[] = new int[qtdCompradas];

        for (int a = 0; a<qtdCompradas; a++){
            compradas[a] = 0;
        }

        for (int a = 0; a<qtdCompradas; a++){
            comprada = scan.nextInt();
            for (int i = 0; i<qtdCompradas; i++){
                if (comprada == compradas[i]){
                    repetida = true;
                }
            }

            if (repetida == false){
                compradas[a] = comprada;
            }

            repetida = false;

        }

        int nFig = 0;

        while(count<qtdCompradas){
            if (compradas[count] != 0){
                nFig = nFig + 1;
            }
            count = count + 1;
        }

        if (tamanho - nFig <= 0){
           System.out.println("0");
        }
        else {
            System.out.println(tamanho - nFig);
        }
    }
}
