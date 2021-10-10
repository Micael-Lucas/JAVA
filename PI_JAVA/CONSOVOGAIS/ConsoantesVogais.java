import java.util.Scanner;

public class ConsoantesVogais
{
    public static void main(String[] args)
    {
        char letra;

        Scanner scan = new Scanner(System.in);

        letra =  scan.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
            System.out.println("vogal");
        }
        else {
            System.out.println("consoante");
        }
    }
}