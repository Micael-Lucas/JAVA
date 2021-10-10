import java.util.Scanner;

public class Transcricao {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String dna = "", rna = "";

        while(scan.hasNext()){
            dna = scan.next();
            for(int i=0 ; i<dna.length() ; i++){
                if(dna.charAt(i) == ('A')){
                    rna = rna.concat("U");
                }
                else if (dna.charAt(i) == ('C')){
                    rna = rna.concat("G");
                }
                else if (dna.charAt(i) == ('T')){
                    rna = rna.concat("A");
                }
                else if (dna.charAt(i) == ('G')){
                    rna = rna.concat("C");
                }
            }

            System.out.println(rna);
            rna = "";
        }
    }
}