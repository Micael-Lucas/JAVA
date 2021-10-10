import java.util.Scanner;

public class OrdenadoDecrescente {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()){
            int qtdnum = sc.nextInt();

            if (qtdnum == 0){
                System.out.println("S");
                continue;
            }


            int lista[] = new int[qtdnum];

            for (int i=0; i<qtdnum; i++){
                lista[i] = sc.nextInt();
            }


            if (vericaordem(lista, qtdnum)){
                System.out.println("S");
            }
            else{
                System.out.println("N");
            }
        }
    }

    public static boolean vericaordem(int lista[], int qtdnum){

        if (qtdnum == 1){
            return true;
        }

        boolean verifica = false;


        for(int i = 0; i<qtdnum-1; i++){
            if (lista[i] >= lista[i+1]){
                verifica = true;
            }
            else {
                verifica = false;
                break;
            }
        }

        return verifica;
    }

}