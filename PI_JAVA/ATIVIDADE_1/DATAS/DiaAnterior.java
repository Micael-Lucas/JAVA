import java.util.Scanner;

public class DiaAnterior
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

                if (dia == 1){
                    if (mes == 1){
                        mes = 12;
                        ano = ano - 1;
                        System.out.println("31 " + mes +" "+ ano);
                    }

                    else if (mes == 5 || mes == 7 || mes == 10 || mes == 12){
                        mes = mes - 1;
                        System.out.println("30 " + mes +" "+ ano);
                    }

                    else if (mes == 8){
                        mes = mes - 1;
                        System.out.println("31 " + mes +" "+ ano);
                    }

                    else if (mes == 3){
                        mes = mes - 1;
                        System.out.println("29 " + mes +" "+ ano);
                    }
                }

                else {
                    dia = dia - 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }

            }

            else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia == 1){
                    mes = mes - 1;
                    System.out.println("31 " + mes +" "+ ano);
                }

                else {
                    dia = dia - 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }

            }

        }

        else if (ano%100 == 0){

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                if (dia == 1){
                    if (mes == 1){
                        mes = 12;
                        ano = ano - 1;
                        System.out.println("31 " + mes +" "+ ano);
                    }

                    else if (mes == 5 || mes == 7 || mes == 10 || mes == 12){
                        mes = mes - 1;
                        System.out.println("30 " + mes +" "+ ano);
                    }

                    else if (mes == 8){
                        mes = mes - 1;
                        System.out.println("31 " + mes +" "+ ano);
                    }

                    else if (mes == 3){
                        mes = mes - 1;
                        System.out.println("28 " + mes +" "+ ano);
                    }
                }

                else {
                    dia = dia - 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }

            }

            else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia == 1){
                    mes = mes - 1;
                    System.out.println("31 " + mes +" "+ ano);
                }

                else {
                    dia = dia - 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }

            }

        }

        else if (ano%4 == 0){

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                if (dia == 1){
                    if (mes == 1){
                        mes = 12;
                        ano = ano - 1;
                        System.out.println("31 " + mes +" "+ ano);
                    }

                    else if (mes == 5 || mes == 7 || mes == 10 || mes == 12){
                        mes = mes - 1;
                        System.out.println("30 " + mes +" "+ ano);
                    }

                    else if (mes == 8){
                        mes = mes - 1;
                        System.out.println("31 " + mes +" "+ ano);
                    }

                    else if (mes == 3){
                        mes = mes - 1;
                        System.out.println("29 " + mes +" "+ ano);
                    }
                }

                else {
                    dia = dia - 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }

            }

            else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia == 1){
                    mes = mes - 1;
                    System.out.println("31 " + mes +" "+ ano);
                }

                else {
                    dia = dia - 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }

            }

        }

        else {

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                if (dia == 1){
                    if (mes == 1){
                        mes = 12;
                        ano = ano - 1;
                        System.out.println("31 " + mes +" "+ ano);
                    }

                    else if (mes == 5 || mes == 7 || mes == 10 || mes == 12){
                        mes = mes - 1;
                        System.out.println("30 " + mes +" "+ ano);
                    }

                    else if (mes == 8){
                        mes = mes - 1;
                        System.out.println("31 " + mes +" "+ ano);
                    }

                    else if (mes == 3){
                        mes = mes - 1;
                        System.out.println("28 " + mes +" "+ ano);
                    }
                }

                else {
                    dia = dia - 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }

            }

            else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia == 1){
                    mes = mes - 1;
                    System.out.println("31 " + mes +" "+ ano);
                }

                else {
                    dia = dia - 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }

            }

        }

    }
}