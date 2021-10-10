import java.util.Scanner;

public class JokenpoSheldon{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int rodadas, count;
        String Rajesh, Sheldon;

        rodadas = scan.nextInt();
        count = 1;

        while (count<=rodadas){
            Rajesh = scan.next();
            Sheldon = scan.next();
            System.out.println(verifica(Rajesh,Sheldon));
            count += 1;
        }
    }

    public static String verifica(String Rajesh, String Sheldon){

        if (Rajesh.equals(Sheldon)){
            return "empate";
        }

        else if (Rajesh.equals("tesoura")){
            if (Sheldon.equals("papel") || Sheldon.equals("lagarto")){
                return "rajesh";
            }
            else{
                return "sheldon";
            }
        }

        else if (Rajesh.equals("papel")){
            if (Sheldon.equals("pedra") || Sheldon.equals("spock")){
                return "rajesh";
            }
            else{
                return "sheldon";
            }
        }

        else if (Rajesh.equals("pedra")){
            if (Sheldon.equals("tesoura") || Sheldon.equals("lagarto")){
                return "rajesh";
            }
            else{
                return "sheldon";
            }
        }

        else if (Rajesh.equals("lagarto")){
            if (Sheldon.equals("papel") || Sheldon.equals("spock")){
                return "rajesh";
            }
            else{
                return "sheldon";
            }
        }

        else if (Rajesh.equals("spock")){
            if (Sheldon.equals("tesoura") || Sheldon.equals("pedra")){
                return "rajesh";
            }
            else{
                return "sheldon";
            }
        }

        return "l";
    }
}