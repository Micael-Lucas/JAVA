import java.util.Scanner;

public class BackToTheFuture
{
    public static void main(String[] args)
    {
        int dia, mes, ano;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        int vezes = scan.nextInt();

        while (count < vezes){
            dia =  scan.nextInt();
            mes =  scan.nextInt();
            ano =  scan.nextInt();

            int qtdComandos = scan.nextInt();
            String comandos = scan.next();

            for (int i=0; i != qtdComandos; i++){
                if (comandos.charAt(i) == '>'){
                    if(ano%400 == 0){
                        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                            if (dia > 0 && dia <= 31){

                                if (dia == 31){
                                    if (mes == 12){
                                        mes = 1;
                                        ano = ano + 1;
                                        dia = 1;
                                    }

                                    else{
                                        mes = mes + 1;
                                        dia = 1;
                                    }
                                }

                                else {
                                    dia = dia + 1;
                                }
                            }
                        }

                        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                            if (dia > 0 && dia <= 30){

                                if (dia == 30){
                                    mes = mes + 1;
                                    dia = 1;
                                }

                                else {
                                    dia = dia + 1;
                                }
                            }
                        }

                        else if (mes == 2){

                            if (dia == 29){
                                mes = mes + 1;
                                dia = 1;
                            }

                            else {
                                dia = dia + 1;
                            }
                        }

                    }

                    else if (ano%100 == 0){

                        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                            if (dia == 31){
                                if (mes == 12){
                                    mes = 1;
                                    ano = ano + 1;
                                    dia = 1;
                                }

                                else{
                                    mes = mes + 1;
                                    dia = 1;
                                }
                            }

                            else {
                                dia = dia + 1;
                            }
                        }

                        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                            if (dia == 30){
                                mes = mes + 1;
                                dia = 1;
                            }

                            else {
                                dia = dia + 1;
                            }

                        }

                        else if (mes == 2){

                            if (dia == 28){
                                mes = mes + 1;
                                dia = 1;
                            }

                            else {
                                dia = dia + 1;
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
                                        dia = 1;
                                    }

                                    else{
                                        mes = mes + 1;
                                        dia = 1;
                                    }
                                }

                                else {
                                    dia = dia + 1;
                                }
                            }
                        }

                        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                            if (dia > 0 && dia <= 30){

                                if (dia == 30){
                                    mes = mes + 1;
                                    dia = 1;
                                }

                                else {
                                    dia = dia + 1;
                                }
                            }
                        }

                        else if (mes == 2){

                            if (dia == 29){
                                mes = mes + 1;
                                dia = 1;
                            }

                            else {
                                dia = dia + 1;
                            }
                        }

                    }


                    else {

                        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                            if (dia == 31){
                                if (mes == 12){
                                    mes = 1;
                                    ano = ano + 1;
                                    dia = 1;
                                }

                                else{
                                    mes = mes + 1;
                                    dia = 1;
                                }
                            }

                            else {
                                dia = dia + 1;
                            }
                        }

                        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){

                            if (dia == 30){
                                mes = mes + 1;
                                dia = 1;
                            }

                            else {
                                dia = dia + 1;
                            }

                        }

                        else if (mes == 2){

                            if (dia == 28){
                                mes = mes + 1;
                                dia = 1;
                            }

                            else {
                                dia = dia + 1;
                            }
                        }

                    }

                }

                else if (comandos.charAt(i) == '<'){
                    if(ano%400 == 0){
                        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                            if (dia == 1){
                                if (mes == 1){
                                    mes = 12;
                                    ano = ano - 1;
                                    dia = 31;
                                }

                                else if (mes == 5 || mes == 7 || mes == 10 || mes == 12){
                                    mes = mes - 1;
                                    dia = 30;
                                }

                                else if (mes == 8){
                                    mes = mes - 1;
                                    dia = 31;
                                }

                                else if (mes == 3){
                                    mes = mes - 1;
                                    dia = 29;
                                }
                            }

                            else {
                                dia = dia - 1;
                            }

                        }

                        else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11){

                            if (dia == 1){
                                mes = mes - 1;
                                dia = 31;
                            }

                            else {
                                dia = dia - 1;
                            }

                        }

                    }

                    else if (ano%100 == 0){

                        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                            if (dia == 1){
                                if (mes == 1){
                                    mes = 12;
                                    ano = ano - 1;
                                    dia = 31;
                                }

                                else if (mes == 5 || mes == 7 || mes == 10 || mes == 12){
                                    mes = mes - 1;
                                    dia = 30;
                                }

                                else if (mes == 8){
                                    mes = mes - 1;
                                    dia = 31;
                                }

                                else if (mes == 3){
                                    mes = mes - 1;
                                    dia = 28;
                                }
                            }

                            else {
                                dia = dia - 1;
                            }

                        }

                        else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11){

                            if (dia == 1){
                                mes = mes - 1;
                                dia = 31;
                            }

                            else {
                                dia = dia - 1;
                            }

                        }

                    }

                    else if (ano%4 == 0){

                        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                            if (dia == 1){
                                if (mes == 1){
                                    mes = 12;
                                    ano = ano - 1;
                                    dia = 31;
                                }

                                else if (mes == 5 || mes == 7 || mes == 10 || mes == 12){
                                    mes = mes - 1;
                                    dia = 30;
                                }

                                else if (mes == 8){
                                    mes = mes - 1;
                                    dia = 31;
                                }

                                else if (mes == 3){
                                    mes = mes - 1;
                                    dia = 29;
                                }
                            }

                            else {
                                dia = dia - 1;
                            }

                        }

                        else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11){

                            if (dia == 1){
                                mes = mes - 1;
                                dia = 31;
                            }

                            else {
                                dia = dia - 1;
                            }

                        }

                    }

                    else {

                        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){

                            if (dia == 1){
                                if (mes == 1){
                                    mes = 12;
                                    ano = ano - 1;
                                    dia = 31;
                                }

                                else if (mes == 5 || mes == 7 || mes == 10 || mes == 12){
                                    mes = mes - 1;
                                    dia = 30;
                                }

                                else if (mes == 8){
                                    mes = mes - 1;
                                    dia = 31;
                                }

                                else if (mes == 3){
                                    mes = mes - 1;
                                    dia = 28;
                                }
                            }

                            else {
                                dia = dia - 1;
                            }

                        }

                        else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11){

                            if (dia == 1){
                                mes = mes - 1;
                                dia = 31;
                            }

                            else {
                                dia = dia - 1;
                            }

                        }

                    }

                }
            }

            System.out.println(dia + "/" + mes + "/" + ano);

            count = count + 1;
        }
    }
}