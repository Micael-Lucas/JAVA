import java.util.Scanner;

public class DuasNotas
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        long valorCompra, valorPago, dif;

        valorCompra = scan.nextLong();
        valorPago = scan.nextLong();
        dif = 0;

        while (valorCompra != 0 || valorPago != 0){

            dif = valorPago - valorCompra;

            if (dif == 7 || dif == 12 || dif == 22 || dif == 52 || dif == 102 || dif == 15 || dif == 25 || dif == 55 || dif == 105 || dif == 30 || dif == 60 || dif == 110 || dif == 70 || dif == 120 || dif == 150 || dif == 4 || dif == 10 || dif == 20 || dif == 40 || dif == 100 || dif == 200){
                if (valorCompra == 0){
                System.out.println("impossible");
                }
                else{
                System.out.println("possible");
                }
            }
            else{
                System.out.println("impossible");
            }

            valorCompra = scan.nextLong();
            valorPago = scan.nextLong();
        }
    }
}