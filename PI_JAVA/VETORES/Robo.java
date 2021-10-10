import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Robo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int posicaoAtual = 0, count = 0, i = 0, qtdMov = 0;

        int qtdRepeticoes = scan.nextInt();

        ArrayList<Integer> salvaPos = new ArrayList<Integer> (1);

        String mov = null;

        while (count < qtdRepeticoes){
            qtdMov = scan.nextInt();

            i = 0;
            posicaoAtual = 0;

            while (i < qtdMov){
                mov = scan.nextLine();

                if (mov.equals("LEFT")){
                    posicaoAtual = posicaoAtual - 1;
                    salvaPos.add(-1);
                }

                else if (mov.equals("RIGHT")){
                    posicaoAtual = posicaoAtual + 1;
                    salvaPos.add(1);
                }

                else {
                    String cortada = mov.substring(8);
                    int res = Integer.parseInt(cortada);

                    int intera = salvaPos.get(res);
                    posicaoAtual = posicaoAtual + intera;
                }

                i = i + 1;
            }

            System.out.println(posicaoAtual);
            count = count + 1;

        }
    }
}