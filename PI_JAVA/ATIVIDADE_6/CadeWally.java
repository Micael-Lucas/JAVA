import java.util.Scanner;

public class CadeWally {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int altura = scan.nextInt();
        int largura = scan.nextInt();

        boolean camiseta = false;
        int Posi = 0, Posa = 0;

        int matriz[][] = new int[altura][largura];

        for(int i=0; i<altura; i++){
            for (int a=0; a<largura; a++){
                matriz[i][a] = scan.nextInt();
            }
        }

        for(int i=0; i<altura; i++){
            for (int a=0; a<largura; a++){
                if (matriz[i][a] == 1111){
                    if (i == 0){
                        if (a == 0){
                            if(matriz[i][a + 1] == 0 && matriz[i][largura - 1] == 0 && matriz[i + 1][a] == 8  && matriz[altura - 1][a] == 4){
                                camiseta = true;
                                Posi = i;
                                Posa = a;
                                break;
                            }
                        }

                        if (a == largura - 1){
                            if(matriz[i][0] == 0 && matriz[i][a - 1] == 0 && matriz[i + 1][a] == 8  && matriz[altura - 1][a] == 4){
                                camiseta = true;
                                Posi = i;
                                Posa = a;
                                break;
                            }
                        }

                        else{
                            if(matriz[i][a + 1] == 0 && matriz[i][a - 1] == 0 && matriz[i + 1][a] == 8  && matriz[altura - 1][a] == 4){
                                camiseta = true;
                                Posi = i;
                                Posa = a;
                                break;
                            }
                        }
                    }

                    else if (i == altura - 1){
                        if (a == 0){
                            if(matriz[i][a + 1] == 0 && matriz[i][largura - 1] == 0 && matriz[0][a] == 8  && matriz[i - 1][a] == 4){
                                camiseta = true;
                                Posi = i;
                                Posa = a;
                                break;
                            }
                        }
                        else if (a == largura - 1){
                            if(matriz[i][0] == 0 && matriz[i][a - 1] == 0 && matriz[0][a] == 8  && matriz[i - 1][a] == 4){
                                camiseta = true;
                                Posi = i;
                                Posa = a;
                                break;
                            }
                        }

                        else{
                            if(matriz[i][a + 1] == 0 && matriz[i][a - 1] == 0 && matriz[0][a] == 8  && matriz[i - 1][a] == 4){
                                camiseta = true;
                                Posi = i;
                                Posa = a;
                                break;
                            }
                        }
                    }

                    else if(a == 0){
                        if(matriz[i][a + 1] == 0 && matriz[i][largura - 1] == 0 && matriz[i + 1][a] == 8  && matriz[i - 1][a] == 4){
                                camiseta = true;
                                Posi = i;
                                Posa = a;
                                break;
                        }
                    }

                    else if(a == largura - 1){
                        if(matriz[i][0] == 0 && matriz[i][a - 1] == 0 && matriz[i + 1][a] == 8  && matriz[i - 1][a] == 4){
                            camiseta = true;
                            Posi = i;
                            Posa = a;
                            break;
                        }
                    }


                    else if(matriz[i][a + 1] == 0 && matriz[i][a - 1] == 0 && matriz[i + 1][a] == 8  && matriz[i - 1][a] == 4) {
                        camiseta = true;
                        Posi = i;
                        Posa = a;
                        break;
                    }
                }
            }

            if (camiseta == true){
                break;
            }
        }

        if (camiseta == true){
            System.out.println(Posi + " " + Posa);
        }
        else{
            System.out.println("WALLY NAO ESTA NA MATRIZ");
        }

    }
}