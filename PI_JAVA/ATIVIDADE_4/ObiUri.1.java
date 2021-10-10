import java.util.Scanner;

public class ObiUri1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String str, palavra ="", fim = "", retorno;
        int vezes, count = 0;

        vezes = scan.nextInt();

        while (count<=vezes){
            str = scan.nextLine();

            while (str.length() != 0){
                for (int i = 0; str.charAt(i) != ' ';){
                    palavra = palavra + (str.charAt(i));
                    str = str.substring(1);
                }

                str = str.substring(1);

                System.out.println(palavra);

                if (count == 0){
                    if (palavra.length() == 3){
                        if (palavra.substring(0,2).equals("OB") || palavra.substring(0,2).equals("UR")){
                            retorno = palavra.substring(0,2)+'I';
                            fim = fim + retorno;
                        }
                    }

                    else{
                        fim = fim + palavra;
                    }
                }

                else if (count>0){
                    if (palavra.length() == 3){
                        if (palavra.substring(0,2).equals("OB") || palavra.substring(0,2).equals("UR")){
                            retorno = palavra.substring(0,2)+'I';
                            fim = fim + " " + retorno;
                        }
                    }

                    else{
                        fim = fim + " " + palavra;
                    }
                }

                System.out.println(fim);

                palavra = "";
            }
        }
    }
}