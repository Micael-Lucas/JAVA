import java.util.Scanner;

public class RodizioVeicular {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String placa, copiaPlaca;
        int count = 0, nTestes;
        boolean validacao = true;

        nTestes = scan.nextInt();

        while (count < nTestes){
            placa = scan.next();


            if (placa.length() != 8){
               System.out.println("FAILURE");
               count = count + 1;
               continue;
            }



            for(int i=0; i<3; i++){
                if (placa.charAt(i) < 65 || placa.charAt(i) > 90){
                    validacao = false;
                    break;
                }
                else {
                    validacao = true;
                }
            }




            if (validacao == false){
                System.out.println("FAILURE");
                count = count + 1;
                continue;
            }




            if(placa.charAt(3) == '-'){
                validacao = true;
            }
            else{
                validacao = false;
            }



            if (validacao == false){
                System.out.println("FAILURE");
                count = count + 1;
                continue;
            }




            for(int i=4; i<8; i++){
                if (placa.charAt(i)>57 || placa.charAt(i)<48){
                    validacao = false;
                    break;
                }
                else {
                    validacao = true;
                }
            }



            if (validacao == false){
                System.out.println("FAILURE");
                count = count + 1;
                continue;
            }



            if(placa.charAt(7) == '1' || placa.charAt(7) == '2'){
                System.out.println("MONDAY");
            }
            else if (placa.charAt(7) == '3' || placa.charAt(7) == '4'){
                System.out.println("TUESDAY");
            }
            else if (placa.charAt(7) == '5' || placa.charAt(7) == '6'){
                System.out.println("WEDNESDAY");
            }
            else if (placa.charAt(7) == '7' || placa.charAt(7) == '8'){
                System.out.println("THURSDAY");
            }
            else if (placa.charAt(7) == '9' || placa.charAt(7) == '0'){
                System.out.println("FRIDAY");
            }

            count = count + 1;
        }
    }
}