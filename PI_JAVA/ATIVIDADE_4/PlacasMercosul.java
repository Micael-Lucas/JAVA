import java.util.Scanner;

public class PlacasMercosul {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String placaAntiga;
        int caracter = 48;
        int letra;

        placaAntiga = scan.nextLine();
        placaAntiga = placaAntiga.replaceAll(" ","");

        while (placaAntiga.charAt(4) != caracter){
            caracter = caracter + 1;
        }

        letra = placaAntiga.charAt(4) + 17;
        char letra_ASCII = (char)letra;

        System.out.println(placaAntiga.substring(0,3)+" "+placaAntiga.charAt(3)+letra_ASCII+placaAntiga.substring(5,7));

    }
}