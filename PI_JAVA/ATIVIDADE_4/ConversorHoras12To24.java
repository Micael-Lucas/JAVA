import java.util.Scanner;

public class ConversorHoras12To24{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int horas, minutos, segundos;
        String periodo;

        while(scan.hasNext()){
            horas = scan.nextInt();
            minutos = scan.nextInt();
            segundos = scan.nextInt();
            periodo = scan.next();

            System.out.println(devolveHoras(horas,periodo) + ":" + minutos + ":" + segundos);
        }
    }

    public static int devolveHoras(int horas, String periodo){
        if (periodo.equals("AM") && horas<12){
            return horas;
        }
        else if(periodo.equals("AM") && horas>=12){
            horas = horas - 12;
            return horas;
        }
        else if(periodo.equals("PM") && horas>=12){
            return horas;
        }
        else if((periodo.equals("PM") && horas<12)){
            horas = horas + 12;
            return horas;
        }

        return 0;
    }
}
