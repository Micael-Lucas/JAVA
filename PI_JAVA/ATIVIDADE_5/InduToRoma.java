import java.util.Scanner;

public class InduToRoma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int indu, milhares = 0, centenas = 0, dezenas = 0, unidades = 0;
        String [] milhar = { "", "M", "MM", "MMM"};
        String [] cente = { "", "C", "CC", "CCC", "CD","D", "DC", "DCC", "DCCC", "CM"};
        String [] deze = { "", "X", "XX", "XXX", "XL","L", "LX", "LXX", "LXXX", "XC"};
        String [] uni = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};


        while(sc.hasNext()){
            indu = sc.nextInt();

            if (indu>999){
                milhares = indu/1000;
                indu = indu%1000;
                centenas = indu/100;
                indu = indu%100;
                dezenas = indu/10;
                indu = indu%10;
                unidades = indu;

                System.out.println(milhar[milhares]+cente[centenas]+deze[dezenas]+uni[unidades]);

            }

            else if (indu>99){
                centenas = indu/100;
                indu = indu%100;
                dezenas = indu/10;
                indu = indu%10;
                unidades = indu;

                System.out.println(cente[centenas]+deze[dezenas]+uni[unidades]);
            }

            else if (indu>9){
                dezenas = indu/10;
                indu = indu%10;
                unidades = indu;

                System.out.println(deze[dezenas]+uni[unidades]);
            }

            else{
                unidades = indu;
                System.out.println(uni[unidades]);
            }

        }
    }
}