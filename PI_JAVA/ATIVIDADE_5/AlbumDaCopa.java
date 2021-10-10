import java.util.Scanner;

public class AlbumDaCopa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tamanhoA = scan.nextInt();

        int NfigEspeciais = scan.nextInt();

        int NfigCompradas = scan.nextInt();

        int pendentes = NfigEspeciais;


        int compradas[] = new int[NfigCompradas];
        int figEsp[] = new int[NfigEspeciais];

        for(int i=0; i<NfigEspeciais; i++){
            figEsp[i] = scan.nextInt();
        }

        for(int i=0; i<NfigCompradas; i++){
            compradas[i] = scan.nextInt();
        }

        for(int i=0; i<NfigEspeciais;i++){
            for (int a = 0; a<NfigCompradas; a++){
                if (figEsp[i] == compradas[a]){
                    pendentes = pendentes - 1;
                    break;
                }
            }
        }

        System.out.println(pendentes);





    }
}