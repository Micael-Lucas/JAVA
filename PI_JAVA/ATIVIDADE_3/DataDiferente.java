import java.util.Scanner;

public class DataDiferente
{
  public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    int diaUm, mesUm, anoUm, diaDois, mesDois, anoDois;

    diaUm = 0;
    mesUm = 0;
    anoUm = 0;
    diaDois = 0;
    mesDois = 0;
    anoDois = 0;

    while(scan.hasNext()){
      diaUm = scan.nextInt();
      mesUm = scan.nextInt();
      anoUm = scan.nextInt();
      diaDois = scan.nextInt();
      mesDois = scan.nextInt();
      anoDois = scan.nextInt();

      if(diferenteData(diaUm, mesUm, anoUm, diaDois, mesDois, anoDois)){
        System.out.println("SIM");
      }
      else{
        System.out.println("NAO");
      }
    }
  }

  static boolean diferenteData(int d, int m, int a, int dd, int mm, int aa){

    boolean resultado = true;

    if (dd - d == 0 && mm - m == 0 && aa - a == 0){
      resultado = false;
    }

    return resultado;
  }
}




