import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Robo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String frase = "SAME AS 123";

        String resultado = frase.substring(8);

        int res = Integer.parseInt(resultado);

        System.out.println(resultado);


    }
}