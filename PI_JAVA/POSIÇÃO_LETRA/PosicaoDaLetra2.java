import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PosicaoDaLetra2
{
    public static void main(String[] args)
    {
        char input,pos;
        int count;

        count = 0;

        Scanner scan = new Scanner(System.in);
        input = scan.next().charAt(0);

        ArrayList<Character> alfabeto = new ArrayList<Character> ();
        alfabeto.add('A');
        alfabeto.add('B');
        alfabeto.add('C');
        alfabeto.add('D');
        alfabeto.add('E');
        alfabeto.add('F');
        alfabeto.add('G');
        alfabeto.add('H');
        alfabeto.add('I');
        alfabeto.add('J');
        alfabeto.add('K');
        alfabeto.add('L');
        alfabeto.add('M');
        alfabeto.add('N');
        alfabeto.add('O');
        alfabeto.add('P');
        alfabeto.add('Q');
        alfabeto.add('R');
        alfabeto.add('S');
        alfabeto.add('T');
        alfabeto.add('U');
        alfabeto.add('V');
        alfabeto.add('W');
        alfabeto.add('X');
        alfabeto.add('Y');
        alfabeto.add('Z');
        //Minusculas
        alfabeto.add('a');
        alfabeto.add('b');
        alfabeto.add('c');
        alfabeto.add('d');
        alfabeto.add('e');
        alfabeto.add('f');
        alfabeto.add('g');
        alfabeto.add('h');
        alfabeto.add('i');
        alfabeto.add('j');
        alfabeto.add('k');
        alfabeto.add('l');
        alfabeto.add('m');
        alfabeto.add('n');
        alfabeto.add('o');
        alfabeto.add('p');
        alfabeto.add('q');
        alfabeto.add('r');
        alfabeto.add('s');
        alfabeto.add('t');
        alfabeto.add('u');
        alfabeto.add('v');
        alfabeto.add('w');
        alfabeto.add('x');
        alfabeto.add('y');
        alfabeto.add('z');


        while (count<26){
            pos = alfabeto.get(count);

            if (input==pos){
                count = count+1;
                System.out.println(count);
                break;
            }

            else{
                count = count+1;
            }
        }

        if (count==26){

            count = 0;

            while (count<26){
                pos = alfabeto.get(count+26);

                if (input==pos){
                    count = count+1;
                    System.out.println(count);
                    break;
                }

                else{
                    count = count+1;
                }

            }

        }

    }
}



