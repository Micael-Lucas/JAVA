import java.util.Scanner;

public class DiaSeguinte
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

                    if (dia == 31){
                        if (mes == 12){
                            mes = 1;
                            ano = ano + 1;
                            System.out.println("1 " + mes +" "+ ano);
                        }

                        else{
                            mes = mes + 1;
                            System.out.println("1 " + mes +" "+ ano);
                        }
                    }

                    else {
                        dia = dia + 1;
                        System.out.println(dia +" "+ mes +" "+ ano);
                    }
                }
            }

            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia > 0 && dia <= 30){

                    if (dia == 30){
                        mes = mes + 1;
                        System.out.println("1 " + mes +" "+ ano);
                    }

                    else {
                        dia = dia + 1;
                        System.out.println(dia +" "+ mes +" "+ ano);
                    }
                }
            }

            else if (mes == 2){

                if (dia == 29){
                    mes = mes + 1;
                    System.out.println("1 " + mes +" "+ ano);
                }

                else {
                    dia = dia + 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }
            }

        }

        else if (ano%100 == 0){

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                if (dia == 31){
                    if (mes == 12){
                        mes = 1;
                        ano = ano + 1;
                        System.out.println("1 " + mes +" "+ ano);
                    }

                    else{
                        mes = mes + 1;
                        System.out.println("1 " + mes +" "+ ano);
                    }
                }

                else {
                    dia = dia + 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }
            }

            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia == 30){
                    mes = mes + 1;
                    System.out.println("1 " + mes +" "+ ano);
                }

                else {
                    dia = dia + 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }

            }

            else if (mes == 2){

                if (dia == 28){
                    mes = mes + 1;
                    System.out.println("1 " + mes +" "+ ano);
                }

                else {
                    dia = dia + 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }
            }

        }

        else if (ano%4 == 0){

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                if (dia > 0 && dia <= 31){

                    if (dia == 31){
                        if (mes == 12){
                            mes = 1;
                            ano = ano + 1;
                            System.out.println("1 " + mes +" "+ ano);
                        }

                        else{
                            mes = mes + 1;
                            System.out.println("1 " + mes +" "+ ano);
                        }
                    }

                    else {
                        dia = dia + 1;
                        System.out.println(dia +" "+ mes +" "+ ano);
                    }
                }
            }

            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia > 0 && dia <= 30){

                    if (dia == 30){
                        mes = mes + 1;
                        System.out.println("1 " + mes +" "+ ano);
                    }

                    else {
                        dia = dia + 1;
                        System.out.println(dia +" "+ mes +" "+ ano);
                    }
                }
            }

            else if (mes == 2){

                if (dia == 29){
                    mes = mes + 1;
                    System.out.println("1 " + mes +" "+ ano);
                }

                else {
                    dia = dia + 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }
            }

        }


        else {

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                if (dia == 31){
                    if (mes == 12){
                        mes = 1;
                        ano = ano + 1;
                        System.out.println("1 " + mes +" "+ ano);
                    }

                    else{
                        mes = mes + 1;
                        System.out.println("1 " + mes +" "+ ano);
                    }
                }

                else {
                    dia = dia + 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }
            }

            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                if (dia == 30){
                    mes = mes + 1;
                    System.out.println("1 " + mes +" "+ ano);
                }

                else {
                    dia = dia + 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }

            }

            else if (mes == 2){

                if (dia == 28){
                    mes = mes + 1;
                    System.out.println("1 " + mes +" "+ ano);
                }

                else {
                    dia = dia + 1;
                    System.out.println(dia +" "+ mes +" "+ ano);
                }
            }

        }
    }

}
