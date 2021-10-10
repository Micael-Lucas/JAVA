import java.util.Scanner;

public class Fibonacci{
    public static void main(String args[]){

        int num = 0;

        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        System.out.println(fazFibonacci(num));
    }

    public static int fazFibonacci(int num){

        int numUm = 0, numDois = 1, count = 3, numProx = 0;

        while(count <= num){
            numProx = numUm + numDois;

            if (count%2 == 1){
                numUm = numProx;
            }
            else if (count%2 == 0){
                numDois = numProx;
            }

            count = count + 1;
        }

        if (num==1){
            return numUm;
        }
        else if (num==2){
            return numDois;
        }
        else{
            return numProx;
        }
    }
}