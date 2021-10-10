import java.util.Scanner;

public class Atletas {

    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);

       int[] idade = new int[100];
       float[] peso = new float[100], altura = new float[100];
       char[] genero = new char[100];


       float qtdH = 0, qtdF = 0, somatoriaHA = 0, somatoriaPF = 0, mediaA, mediaP;
       int acimaMediaP = 0, acimaMediaA = 0;

       for (int i=0; i<100; i++){
           idade[i] = scan.nextInt();
           altura[i] = scan.nextFloat();
           peso[i] = scan.nextFloat();
           genero[i] = scan.next().charAt(0);

           if (genero[i] == 'M'){
               qtdH = qtdH + 1;
               somatoriaHA = somatoriaHA + altura[i];
           }
           else if (genero[i] == 'F'){
               qtdF = qtdF + 1;
               somatoriaPF = somatoriaPF + peso[i];
           }
       }

       mediaA = somatoriaHA / qtdH;
       mediaP = somatoriaPF / qtdF;

       for (int a=0; a<100; a++){
           if (genero[a] == ('M')){
               if (altura[a] > mediaA){
                   acimaMediaA = acimaMediaA + 1;
               }
           }
           else if (genero[a] == ('F')){
               if (peso[a] < mediaP){
                   acimaMediaP = acimaMediaP + 1;
               }
           }
       }

       if (qtdH > 0){
            System.out.println("Ha " + acimaMediaA + " atletas homens acima da media da altura dos homens.");
       }

       else{
           System.out.println("Nao houve entrada de atletas homens.");
       }

       if (qtdF > 0){
           System.out.println("Ha " + acimaMediaP + " atletas mulheres abaixo da media do peso das mulheres.");
       }

       else{
           System.out.println("Nao houve entrada de atletas mulheres.");
       }
    }
}