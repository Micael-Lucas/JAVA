import java.util.Scanner;

public class SomaVet {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        long somatoria = 0;
        int nMembros = scan.nextInt();

        long[] numeros = new long[nMembros];

        for (int i=0; i<nMembros; i++){
            numeros[i] = scan.nextLong();
        }

        for(int a=0; a<nMembros; a++){
            somatoria = somatoria + numeros[a];
        }

        System.out.println(somatoria);
    }
}