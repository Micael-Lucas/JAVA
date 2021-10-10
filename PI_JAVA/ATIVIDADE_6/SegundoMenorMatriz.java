import java.util.Scanner;

public class SegundoMenorMatriz{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int linhas = scan.nextInt();
        int colunas = scan.nextInt();
        int menor = 0;
        int Smenor = 0;
        int posi = 0, posa = 0;

        int matriz[][] = new int[linhas][colunas];

        for(int i = 0; i<linhas; i++){
            for (int a=0; a<colunas; a++){
                matriz[i][a] = scan.nextInt();
            }
        }

        for(int i = 0; i<linhas; i++){
            for (int a=0; a<colunas; a++){
                if (i==0 && a==0){
                    menor = matriz[i][a];
                    posi = i;
                    posa = a;
                }

                else if(matriz[i][a]<menor){
                    menor = matriz[i][a];
                    posi = i;
                    posa = a;
                }
            }
        }


        for(int i = 0; i<linhas; i++){
            for (int a=0; a<colunas; a++){

                if (i == 0 && a == 0){
                    if (i == posi && a == posa){
                        if (colunas >1)
                            Smenor = matriz[i][a + 1];
                        else if (colunas == 1){
                            Smenor = matriz[i + 1][a];
                        }
                    }
                    else{
                        Smenor = matriz[i][a];
                    }
                }

                if (i == posi && a == posa){

                }

                else if (matriz[i][a] < Smenor){
                    Smenor = matriz[i][a];
                }
            }
        }

        System.out.println(Smenor);
    }
}