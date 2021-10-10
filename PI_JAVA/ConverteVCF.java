import java.util.Scanner;

public class ConverteVCF {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nomes[] = new String[258];
        String telefones[] = new String[258];
        String input = "oi";


        for (int i=0; i<258; i++){

            while (true){
                input = scan.nextLine();

                if (input.charAt(0) == 'F' && input.charAt(1) == 'N'){
                    nomes[i] = input;
                }

                if ()){
                    telefones[i] = input;
                }

                if (input.equals("END:VCARD")){
                    break;
                }
            }

        }

        for (int a=0; a<258; a++){
            System.out.println(nomes[a]);
            System.out.println(telefones[a]);
        }



    }
}