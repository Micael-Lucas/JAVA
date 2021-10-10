import java.util.Scanner;

public class CompareStrings{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        String str1 = null, str2 = null;

        while(scan.hasNext()){
            str1 = scan.next();
            str2 = scan.next();
            if(comparaStrings(str1 , str2)){
                System.out.println("Identicos");
            }
            else{
                System.out.println("diferentes");
            }
        }
    }

    public static boolean comparaStrings(String str1 , String str2){

        boolean retorno = false;

        if (str1.compareTo(str2) == 0){
            retorno = true;
        }

        return retorno;
    }
}