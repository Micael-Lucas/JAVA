import java.util.Scanner;

public class Sabre {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int alt = scan.nextInt();
        int lar = scan.nextInt();
        int posi = 0, posa = 0;
        boolean achei = false;

        int matriz[][] = new int[alt][lar];

        for (int i=0; i<alt; i++){
            for(int a=0; a<lar; a++){
                matriz[i][a] = scan.nextInt();
            }
        }

        for (int i=0; i<alt; i++){
            for(int a=0; a<lar; a++){
                if(matriz[i][a] == 42 && i != 0 && i != alt - 1 && a!= 0 && a!= lar - 1){
                    if (matriz[i][a + 1] == 7 && matriz[i][a - 1] == 7 && matriz[i + 1][a] == 7 && matriz[i + 1][a + 1] == 7 && matriz[i + 1][a - 1] == 7 && matriz[i - 1][a] == 7 && matriz[i - 1][a + 1] == 7 && matriz[i - 1][a - 1] == 7 ){
                        posi = i;
                        posa = a;
                        achei = true;
                        break;
                    }
                }
            }

            if (achei == true){
                break;
            }
        }



        if (achei == true){
            posi = posi + 1;
            posa = posa + 1;
            System.out.println(posi + " " + posa);
        }
        else{
            System.out.println(posi + " " + posa);
        }
    }
}