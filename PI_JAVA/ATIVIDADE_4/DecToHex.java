import java.util.Scanner;

public class DecToHex {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        long numero = 0, divisao = 0, resto = 0;
        String hex = "", restonum = "";
        boolean continua = true;

        while(scan.hasNext()){
            numero = scan.nextLong();

            while(continua == true){
                divisao = numero/16l;
                resto = numero%16l;

                if (resto <= 9){
                    restonum = Long.toString(resto);
                    hex = hex + resto;
                }
                else if(resto > 9){
                    if (resto == 10){
                        hex = hex + "A";
                    }
                    else if (resto == 11){
                        hex = hex + "B";
                    }
                    else if (resto == 12){
                        hex = hex + "C";
                    }
                    else if (resto == 13){
                        hex = hex + "D";
                    }
                    else if (resto == 14){
                        hex = hex + "E";
                    }
                    else if (resto == 15){
                        hex = hex + "F";
                    }
                }

                if (numero<16){
                    continua = false;
                }

                numero = divisao;
            }

            StringBuilder hexa = new StringBuilder(hex);

            System.out.println(hexa.reverse());
            hex = "";
            continua = true;
        }
    }
}