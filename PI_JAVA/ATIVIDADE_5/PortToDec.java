import java.util.Scanner;

public class PortToDec {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String str = scan.nextLine();
            str = str.replace(" ", ", ");
            int resultado = 0;

            String[] lista = str.split(", ");

            for(String nome : lista){

                if (nome.equals("novecentos")){
                    resultado = resultado + 900;
                }

                else if (nome.equals("oitocentos")){
                    resultado = resultado + 800;
                }

                else if (nome.equals("setecentos")){
                    resultado = resultado + 700;
                }

                else if (nome.equals("seiscentos")){
                    resultado = resultado + 600;
                }

                else if (nome.equals("quinhentos")){
                    resultado = resultado + 500;
                }

                else if (nome.equals("quatrocentos")){
                    resultado = resultado + 400;
                }

                else if (nome.equals("trezentos")){
                    resultado = resultado + 300;
                }

                else if (nome.equals("duzentos")){
                    resultado = resultado + 200;
                }

                else if (nome.equals("cento") || nome.equals("cem")){
                    resultado = resultado + 100;
                }

                else if (nome.equals("noventa")){
                    resultado = resultado + 90;
                }

                else if (nome.equals("oitenta")){
                    resultado = resultado + 80;
                }

                else if (nome.equals("setenta")){
                    resultado = resultado + 70;
                }

                else if (nome.equals("sessenta")){
                    resultado = resultado + 60;
                }

                else if (nome.equals("cinquenta")){
                    resultado = resultado + 50;
                }

                else if (nome.equals("quarenta")){
                    resultado = resultado + 40;
                }

                else if (nome.equals("trinta")){
                    resultado = resultado + 30;
                }

                else if (nome.equals("vinte")){
                    resultado = resultado + 20;
                }

                else if (nome.equals("dezenove")){
                    resultado = resultado + 19;
                }

                else if (nome.equals("dezoito")){
                    resultado = resultado + 18;
                }

                else if (nome.equals("dezessete")){
                    resultado = resultado + 17;
                }

                else if (nome.equals("dezesseis")){
                    resultado = resultado + 16;
                }

                else if (nome.equals("quinze")){
                    resultado = resultado + 15;
                }

                else if (nome.equals("quatorze") || nome.equals("catorze")){
                    resultado = resultado + 14;
                }

                else if (nome.equals("treze")){
                    resultado = resultado + 13;
                }

                else if (nome.equals("doze")){
                    resultado = resultado + 12;
                }

                else if (nome.equals("onze")){
                    resultado = resultado + 11;
                }

                else if (nome.equals("dez")){
                    resultado = resultado + 10;
                }

                else if (nome.equals("nove")){
                    resultado = resultado + 9;
                }

                else if (nome.equals("oito")){
                    resultado = resultado + 8;
                }

                else if (nome.equals("sete")){
                    resultado = resultado + 7;
                }

                else if (nome.equals("seis")){
                    resultado = resultado + 6;
                }

                else if (nome.equals("cinco")){
                    resultado = resultado + 5;
                }

                else if (nome.equals("quatro")){
                    resultado = resultado + 4;
                }

                else if (nome.equals("tres")){
                    resultado = resultado + 3;
                }

                else if (nome.equals("dois")){
                    resultado = resultado + 2;
                }

                else if (nome.equals("um")){
                    resultado = resultado + 1;
                }

                else if (nome.equals("mil")){
                    resultado = resultado * 1000;
                }

                else if (nome.equals("e")){
                    resultado = resultado + 0;
                }

            }

            System.out.println(resultado);

        }
    }
}