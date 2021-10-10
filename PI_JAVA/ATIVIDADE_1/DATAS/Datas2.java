import java.util.Scanner;

public class Datas2
{
    public static void main(String[] args)
    {
        int dia, mes, ano;

        Scanner scan = new Scanner(System.in);

        dia =  scan.nextInt();
        mes =  scan.nextInt();
        ano =  scan.nextInt();

        if(ano%400 == 0){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                if (dia > 0 && dia <= 31){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 31) {
                    System.out.println("DATA INVALIDA");
                }

            }

            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia > 0 && dia <= 30){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 30) {
                    System.out.println("DATA INVALIDA");
                }

            }

            else if (mes == 2){

                if (dia > 0 && dia <= 29){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 29) {
                    System.out.println("DATA INVALIDA");
                }
            }

            else {
                System.out.println("DATA INVALIDA");
            }
        }

        else if (ano%100 == 0){

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                if (dia > 0 && dia <= 31){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 31) {
                    System.out.println("DATA INVALIDA");
                }

            }

            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia > 0 && dia <= 30){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 30) {
                    System.out.println("DATA INVALIDA");
                }

            }

            else if (mes == 2){

                if (dia > 0 && dia <= 28){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 28) {
                    System.out.println("DATA INVALIDA");
                }
            }

            else {
                System.out.println("DATA INVALIDA");
            }

        }

        else if (ano%4 == 0){

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                if (dia > 0 && dia <= 31){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 31) {
                    System.out.println("DATA INVALIDA");
                }

            }

            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia > 0 && dia <= 30){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 30) {
                    System.out.println("DATA INVALIDA");
                }

            }

            else if (mes == 2){

                if (dia > 0 && dia <= 29){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 29) {
                    System.out.println("DATA INVALIDA");
                }
            }

            else {
                System.out.println("DATA INVALIDA");
            }

        }

        else {

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                if (dia > 0 && dia <= 31){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 31) {
                    System.out.println("DATA INVALIDA");
                }

            }

            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia > 0 && dia <= 30){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 30) {
                    System.out.println("DATA INVALIDA");
                }

            }

            else if (mes == 2){

                if (dia > 0 && dia <= 28){
                    System.out.println("DATA VALIDA");
                }

                else if (dia < 0 || dia > 28) {
                    System.out.println("DATA INVALIDA");
                }
            }

            else {
                 System.out.println("DATA INVALIDA");
            }
        }

    }

}
