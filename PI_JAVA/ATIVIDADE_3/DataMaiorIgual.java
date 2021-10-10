import java.util.Scanner;

public class DataMaiorIgual
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

      if(maiorIgualData(diaUm, mesUm, anoUm, diaDois, mesDois, anoDois)){
        System.out.println("SIM");
      }
      else{
        System.out.println("NAO");
      }
    }
  }

  static boolean maiorIgualData(int d, int m, int a, int dd, int mm, int aa){

    boolean resultado = true;

    if (aa == a && mm == m && dd == d){
      resultado = true;
    }
    else {
      if (aa > a){
        resultado = false;
      }
      else if (aa == a){
        if (mm > m){
          resultado = false;
        }
        else if(mm == m){
          if(dd >= d){
            resultado = false;
          }
          else{
            resultado = true;
          }
        }
        else if(mm < m){
          resultado = true;
        }
      }
      else if(aa < a){
        resultado = true;
      }
    }

    return resultado;
  }
}




