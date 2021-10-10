import java.util.Scanner;

public class ContaDigitos
{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            int  x = scan.nextInt();
            System.out.println(contaDig(x));
        }
    }

    static int contaDig(int x){
        int resultado = 0;

        if (x >= 10){
            while(x >= 10){
                x = x / 10;
                if (x<10){
                    resultado = resultado + 2;
                }
                else{
                    resultado = resultado + 1;
                }
            }
        }

        else {
            resultado = 1;
        }

        return resultado;
    }
}
