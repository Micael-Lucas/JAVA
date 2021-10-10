import java.util.Scanner;

public class GameOfThrones {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int soma = 0;
        int erro = 0;
        boolean confere = true;
        String str = scan.next();

        if (str.length()%2 == 0){

            for (int y=0; y < str.length(); y++){
                for (int i=0; i < str.length();i++){
                    if (str.charAt(y) == str.charAt(i)){
                        soma = soma + 1;
                    }
                }

                if (soma%2 == 0){
                    soma = 0;
                    continue;
                }

                else if (soma%2 == 1){
                    System.out.println("NO");
                    confere = false;
                    break;
                }
            }

            if (confere){
                System.out.println("SIM");
            }
        }

        else {
            for (int y=0; y < str.length(); y++){
                for (int i=0; i < str.length();i++){
                    if (str.charAt(y) == str.charAt(i)){
                        soma = soma + 1;
                    }
                }

                if (soma%2 == 0){
                    soma = 0;
                    continue;
                }

                else if (soma%2 == 1 && erro == 0){
                    erro = 1;
                    str = str.replace(str.charAt(y), '0');
                    str = str.concat("0");
                    continue;
                }

                else if(soma%2 == 1 && erro == 1){
                    System.out.println("NO");
                    confere = false;
                    break;
                }
            }

            if (confere){
                System.out.println("SIM");
            }

        }
    }
}