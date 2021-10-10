import java.util.Scanner;

public class ObiUri {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String palavra = "a", strfinal = "", retorno = "";
        int count = 0, vezes;

        vezes = scan.nextInt();

        while(count<vezes){
            palavra = scan.next();

            if (palavra.length() != 3){
                retorno = palavra;
            }
            else if (palavra.substring(0,2).equals("OB") || palavra.substring(0,2).equals("UR")){
                retorno = palavra.substring(0,2).concat("I");
            }

            System.out.println(retorno);

            count = count + 1;
        }
    }
}