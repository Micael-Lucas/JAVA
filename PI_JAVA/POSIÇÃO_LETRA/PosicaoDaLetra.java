import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PosicaoDaLetra
{
    public static void main(String[] args)
    {
        char input,pos;
        int count;

        count = 0;

        Scanner scan = new Scanner(System.in);
        input = scan.next().charAt(0);
        ArrayList<Character> alfabeto = new ArrayList<Character> (1);
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


        while (count!=26){
            pos = alfabeto.get(count);

            if (input==pos){
                count =count+1;
                System.out.println(count);
                break;
            }

            else{
                count = count+1;
            }
        }
    }
}

//equals(Object o)