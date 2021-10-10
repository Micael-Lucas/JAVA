import java.util.Scanner;

public class SaltandoNuvens {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int qtdNuvens = sc.nextInt();

        int posNuv[] = new int[qtdNuvens];
        int i = 0;

        while(i<qtdNuvens){
            posNuv[i] = sc.nextInt();
            i = i + 1;
        }

        int posicao = 0;
        int movimento = 0;

        while(posicao != qtdNuvens - 1){
            if (qtdNuvens - posicao > 2){
                if (posNuv[posicao + 2] == 0){
                    movimento = movimento + 1;
                    posicao = posicao + 2;
                }
                else{
                    movimento = movimento + 1;
                    posicao = posicao + 1;
                }
            }

            else if  (qtdNuvens - posicao <= 2){
                movimento = movimento + 1;
                posicao = posicao + 1;
            }
        }

        System.out.println(movimento);
    }
}