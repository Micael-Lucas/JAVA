import java.util.Scanner;

public class IntercalaStrings2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String ordenado = "";

        char cha = '-';

        int n = scan.nextInt();
        int m = scan.nextInt();

        String strn = str.substring(0,n);

        str = str.substring(n);

        String strm = str.substring(0,m);

        str = strn.concat(strm);

        for (int letra = 97; str.length() != ordenado.length(); letra++){
            for (int i=0;i<str.length();i++){
                if (str.charAt(i) == letra){
                    cha = (char)letra;
                    ordenado = ordenado.concat(Character.toString(cha));
                }
            }
        }

        System.out.println(ordenado);

    }
}