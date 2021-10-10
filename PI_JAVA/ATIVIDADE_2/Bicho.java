import java.util.Scanner;

public class Bicho
{
    public static void main(String[] args)
    {
        long numero, count;
        double numeroReal, numTes;

        Scanner scan = new Scanner(System.in);

        numTes = 0;
        numeroReal = 0;
        count = 1;
        numero = 0;

        while (count <= 7){

            numero = scan.nextLong();

            numeroReal = numero%100;

            numTes = numeroReal/4;

            if (numTes > 0 && numTes <= 1){
                System.out.println("avestruz");
                count = count + 1;
            }

            else if (numTes > 1 && numTes <=2){
                System.out.println("aguia");
                count = count + 1;
            }

            else if (numTes > 2 && numTes <=3){
                System.out.println("burro");
                count = count + 1;
            }

            else if (numTes > 3 && numTes <=4){
                System.out.println("borboleta");
                count = count + 1;
            }

            else if (numTes > 4 && numTes <=5){
                System.out.println("cachorro");
                count = count + 1;
            }

            else if (numTes > 5 && numTes <=6){
                System.out.println("cabra");
                count = count + 1;
            }

            else if (numTes > 6 && numTes <=7){
                System.out.println("carneiro");
                count = count + 1;
            }

            else if (numTes > 7 && numTes <=8){
                System.out.println("camelo");
                count = count + 1;
            }

            else if (numTes > 8 && numTes <=9){
                System.out.println("cobra");
                count = count + 1;
            }

            else if (numTes > 9 && numTes <=10){
                System.out.println("coelho");
                count = count + 1;
            }

            else if (numTes > 10 && numTes <=11){
                System.out.println("cavalo");
                count = count + 1;
            }

            else if (numTes > 11 && numTes <=12){
                System.out.println("elefante");
                count = count + 1;
            }

            else if (numTes > 12 && numTes <=13){
                System.out.println("galo");
                count = count + 1;
            }

            else if (numTes > 13 && numTes <=14){
                System.out.println("gato");
                count = count + 1;
            }

            else if (numTes > 14 && numTes <=15){
                System.out.println("jacare");
                count = count + 1;
            }

            else if (numTes > 15 && numTes <=16){
                System.out.println("leao");
                count = count + 1;
            }

            else if (numTes > 16 && numTes <=17){
                System.out.println("macaco");
                count = count + 1;
            }

            else if (numTes > 17 && numTes <=18){
                System.out.println("porco");
                count = count + 1;
            }

            else if (numTes > 18 && numTes <=19){
                System.out.println("pavao");
                count = count + 1;
            }

            else if (numTes > 19 && numTes <=20){
                System.out.println("peru");
                count = count + 1;
            }

            else if (numTes > 20 && numTes <=21){
                System.out.println("touro");
                count = count + 1;
            }

            else if (numTes > 21 && numTes <=22){
                System.out.println("tigre");
                count = count + 1;
            }

            else if (numTes > 22 && numTes <=23){
                System.out.println("urso");
                count = count + 1;
            }

            else if (numTes > 23 && numTes <=24){
                System.out.println("veado");
                count = count + 1;
            }

            else if (numTes > 24 || numTes == 0){
                System.out.println("vaca");
                count = count + 1;
            }
        }
    }
}