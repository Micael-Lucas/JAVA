import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int soma = 0, contador = 0;

        int tamanho = sc.nextInt();

        int lista[] = new int[tamanho];

        for (int i=0; i<tamanho; i++){
            lista[i] = sc.nextInt();
        }

        int resSoma = sc.nextInt();
        int tamSoma = sc.nextInt();

        for(int i=0; i<=tamanho - tamSoma; i++){
            for(int a=i; a<i+tamSoma; a++){
                soma = soma + lista[a];
            }
            if (soma == resSoma){
                contador = contador + 1;
            }

            soma = 0;
        }

        System.out.println(contador);


    }
}