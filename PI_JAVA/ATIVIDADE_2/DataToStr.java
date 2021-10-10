import java.util.Scanner;

public class DataToStr
{
    public static void main(String[] args)
    {
        long dia, mes, ano;

        Scanner scan = new Scanner(System.in);

        dia = 1;
        mes = 1;
        ano = 1;

        while (scan.hasNext()){

            dia = scan.nextLong();
            mes = scan.nextLong();
            ano = scan.nextLong();

            if (mes == 1){
                if (dia < 10){
                    System.out.println("0" + dia + " de Janeiro de " + ano);
                }
                else{
                    System.out.println( dia + " de Janeiro de " + ano);
                }
            }

            else if (mes == 2){
                if (dia < 10){
                    System.out.println("0" + dia + " de Fevereiro de " + ano);
                }
                else{
                    System.out.println( dia + " de Fevereiro de " + ano);
                }
            }

            else if (mes == 3){
                if (dia < 10){
                    System.out.println("0" + dia + " de Marco de " + ano);
                }
                else{
                    System.out.println( dia + " de Marco de " + ano);
                }
            }

            else if (mes == 4){
                if (dia < 10){
                    System.out.println("0" + dia + " de Abril de " + ano);
                }
                else{
                    System.out.println( dia + " de Abril de " + ano);
                }
            }

            else if (mes == 5){
                if (dia < 10){
                    System.out.println("0" + dia + " de Maio de " + ano);
                }
                else{
                    System.out.println( dia + " de Maio de " + ano);
                }
            }

            else if (mes == 6){
                if (dia < 10){
                    System.out.println("0" + dia + " de Junho de " + ano);
                }
                else{
                    System.out.println( dia + " de Junho de " + ano);
                }
            }

            else if (mes == 7){
                if (dia < 10){
                    System.out.println("0" + dia + " de Julho de " + ano);
                }
                else{
                    System.out.println( dia + " de Julho de " + ano);
                }
            }

            else if (mes == 8){
                if (dia < 10){
                    System.out.println("0" + dia + " de Agosto de " + ano);
                }
                else{
                    System.out.println( dia + " de Agosto de " + ano);
                }
            }

            else if (mes == 9){
                if (dia < 10){
                    System.out.println("0" + dia + " de Setembro de " + ano);
                }
                else{
                    System.out.println( dia + " de Setembro de " + ano);
                }
            }

            else if (mes == 10){
                if (dia < 10){
                    System.out.println("0" + dia + " de Outubro de " + ano);
                }
                else{
                    System.out.println( dia + " de Outubro de " + ano);
                }
            }

            else if (mes == 11){
                if (dia < 10){
                    System.out.println("0" + dia + " de Novembro de " + ano);
                }
                else{
                    System.out.println( dia + " de Novembro de " + ano);
                }
            }

            else if (mes == 12){
                if (dia < 10){
                    System.out.println("0" + dia + " de Dezembro de " + ano);
                }
                else{
                    System.out.println( dia + " de Dezembro de " + ano);
                }
            }
        }
    }
}