import java.util.Scanner;

public class HexToDec{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String hexadecimal = "";


        while(scan.hasNext()){
            hexadecimal = scan.next();
            System.out.println(converteHexToDec(hexadecimal));
        }
    }

    public static long converteHexToDec(String hex){

        long numero = 0;
        char carac;

        while (hex.length()>0){
            carac = hex.charAt(0);

            if (carac == '1'){
                numero = numero + 1*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == '2'){
                numero = numero + 2*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == '3'){
                numero = numero + 3*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == '4'){
                numero = numero + 4*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == '5'){
                numero = numero + 5*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == '6'){
                numero = numero + 6*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == '7'){
                numero = numero + 7*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == '8'){
                numero = numero + 8*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == '9'){
                numero = numero + 9*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == 'A'){
                numero = numero + 10*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == 'B'){
                numero = numero + 11*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == 'C'){
                numero = numero + 12*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == 'D'){
                numero = numero + 13*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == 'E'){
                numero = numero + 14*Math.round(Math.pow(16,hex.length() - 1));
            }
            else if (carac == 'F'){
                numero = numero + 15*Math.round(Math.pow(16,hex.length() - 1));
            }

            hex = hex.substring(1);
        }

        return numero;
    }
}