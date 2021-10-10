import java.util.Scanner;

public class Pangrama {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String texto = "a";

        while(scan.hasNext()){
            texto = scan.nextLine();
            texto = texto.replaceAll(" ","");
            if (verificador(texto)){
                System.out.println("sim");
            }
            else{
                System.out.println("nao");
            }
        }
    }

    public static boolean verificador(String texto){

        boolean A = false, B = false, C = false, D = false, E = false, F = false, G = false, H = false, I = false, J = false, K = false, L = false, M = false, N = false, O = false, P = false, Q = false, R = false, S = false, T = false, U = false, V = false, W = false, X = false, Y = false, Z = false;
        char cha='0';

        while (texto.length()>0){
            cha = texto.charAt(0);

            if (cha == 'A' || cha == 'a'){
                A = true;
            }
            else if (cha == 'B' || cha == 'b'){
                B = true;
            }
            else if (cha == 'C' || cha == 'c'){
                C = true;
            }
            else if (cha == 'D' || cha == 'd'){
                D = true;
            }
            else if (cha == 'E' || cha == 'e'){
                E = true;
            }
            else if (cha == 'F' || cha == 'f'){
                F = true;
            }
            else if (cha == 'G' || cha == 'g'){
                G = true;
            }
            else if (cha == 'H' || cha == 'h'){
                H = true;
            }
            else if (cha == 'I' || cha == 'i'){
                I = true;
            }
            else if (cha == 'J' || cha == 'j'){
                J = true;
            }
            else if (cha == 'K' || cha == 'k'){
                K = true;
            }
            else if (cha == 'L' || cha == 'l'){
                L = true;
            }
            else if (cha == 'M' || cha == 'm'){
                M = true;
            }
            else if (cha == 'N' || cha == 'n'){
                N = true;
            }
            else if (cha == 'O' || cha == 'o'){
                O = true;
            }
            else if (cha == 'P' || cha == 'p'){
                P = true;
            }
            else if (cha == 'Q' || cha == 'q'){
                Q = true;
            }
            else if (cha == 'R' || cha == 'r'){
                R = true;
            }
            else if (cha == 'S' || cha == 's'){
                S = true;
            }
            else if (cha == 'T' || cha == 't'){
                T = true;
            }
            else if (cha == 'U' || cha == 'u'){
                U = true;
            }
            else if (cha == 'V' || cha == 'v'){
                V = true;
            }
            else if (cha == 'W' || cha == 'w'){
                W = true;
            }
            else if (cha == 'X' || cha == 'x'){
                X = true;
            }
            else if (cha == 'Y' || cha == 'y'){
                Y = true;
            }
            else if (cha == 'Z' || cha == 'z'){
                Z = true;
            }

            texto = texto.substring(1);
        }

        if (A == true && B == true && C == true && D == true && E == true && F == true && G == true && H == true && I == true && J == true && K == true && L == true && M == true && N == true && O == true && P == true && Q == true && R == true && S == true && T == true && U == true && V == true && W == true && X == true && Y == true && Z == true){
            return true;
        }

        return false;
    }
}