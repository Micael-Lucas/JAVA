import java.util.Scanner;

public class SaltandoNuvens2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int qtdNuvens = scan.nextInt();
        int salto = scan.nextInt();

        int lista[] = new int[qtdNuvens];

        for (int i = 0; i<qtdNuvens; i++){
            lista[i] = scan.nextInt();
        }

        int i = 0;
        int gasto = 0;

        do {
            i = (i + salto)%qtdNuvens;

            if (lista[i] == 0){
                gasto = gasto + 1;
            }

            else {
                gasto = gasto + 3;
            }

        }while(i!=0);

        int energia = 100 - gasto;

        System.out.println(energia);
    }
}