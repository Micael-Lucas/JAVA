import java.util.Scanner;

public class Handebol
{
    public static void main(String[] args)
    {

        int nPart, nJog, countPart, countJog, jog, gols;
        boolean teve;

        Scanner scan = new Scanner(System.in);

        nJog = scan.nextInt();
        nPart = scan.nextInt();

        countJog = 0;
        countPart = 0;
        gols = 0;
        jog = 0;
        teve = false;

        while (countJog < nJog){

            while (countPart < nPart) {
                gols = scan.nextInt();
                countPart = countPart + 1;

                    if (gols == 0){
                        teve = true;
                    }
            }

            if (teve == false){
                jog = jog + 1;
            }

            countJog = countJog + 1;
            countPart = 0;
            teve = false;
        }

        System.out.println(jog);
    }
}