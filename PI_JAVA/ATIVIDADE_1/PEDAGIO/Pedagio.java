import java.util.Scanner;

public class Pedagio
{
    public static void main(String[] args)
    {
        int CompEstrada, DistPed, CustPorKm, ValorPed, CustoTotPed, CustoTotCar, CustoTotal;

        Scanner scan = new Scanner(System.in);

        CompEstrada = scan.nextInt();
        DistPed = scan.nextInt();
        CustPorKm = scan.nextInt();
        ValorPed = scan.nextInt();

        CustoTotPed = (CompEstrada / DistPed) * ValorPed;
        CustoTotCar = CompEstrada * CustPorKm;
        CustoTotal = CustoTotCar + CustoTotPed;

        System.out.println(CustoTotal);
    }
}