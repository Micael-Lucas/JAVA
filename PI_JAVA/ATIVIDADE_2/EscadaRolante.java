import java.util.Scanner;

public class EscadaRolante
{
    public static void main(String[] args)
    {
        int tempotot, tempoanterior, tempo, count, pessoasUsaram, dif;

        Scanner scan = new Scanner(System.in);

        count = 1;
        tempotot = 0;
        tempo = 0;
        pessoasUsaram = 1;
        tempoanterior = 0;
        dif = 0;

        while (pessoasUsaram != 0){
            pessoasUsaram = scan.nextInt();

            if (pessoasUsaram == 1){
                tempo = scan.nextInt();
                tempotot = 10;
                System.out.println(tempotot);
            }

            else if(pessoasUsaram > 1){

                while(count<=pessoasUsaram){

                    if (count == 1){
                        tempo = scan.nextInt();
                        tempoanterior = tempo + 10;
                        tempotot = 10;

                    }


                    else if(count>1){
                        tempo = scan.nextInt();
                        if (tempoanterior >= tempo){
                            dif = tempo + 10 - tempoanterior;
                            tempotot = tempotot + dif;
                            tempoanterior = tempoanterior + dif;
                        }
                        else if (tempoanterior < tempo){
                            tempoanterior = tempo + 10;
                            tempotot = tempotot + 10;
                        }

                    }

                    count = count + 1;
                }

                System.out.println(tempotot);
            }

            count = 0;

        }

    }
}