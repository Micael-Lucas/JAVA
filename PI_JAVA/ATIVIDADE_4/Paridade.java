import java.util.Scanner;

public class Paridade {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String bits, salvaBits;
        char cha;
        int bitsum = 0;

        bits = scan.next();

        salvaBits = bits;

        while (bits.length()>0){
            cha = bits.charAt(0);

            if (cha == '1'){
                bitsum += 1;
            }

            bits = bits.substring(1);
        }

        if (bitsum%2 == 0){
            System.out.println(salvaBits + "0");
        }
        else{
             System.out.println(salvaBits + "1");
        }

    }
}