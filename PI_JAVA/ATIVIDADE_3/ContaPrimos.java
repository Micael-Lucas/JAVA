import java.util.Scanner;

public class ContaPrimos
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);

    int num, count, primos;

    primos = 0;
    count = 0;
    num = scan.nextInt();

    while (num != 0){
      if (ehPrimo(num)){
        primos = primos + 1;
      }

      count = count + 1;
      num = scan.nextInt();
    }

    System.out.println("dos " + count + " numeros informados " + primos + " eram primos");

  }

  static boolean ehPrimo(int num){

    int contador = num - 1;
    boolean resultado = true;

    if (num == 1){
        resultado = false;
    }

    while (contador > 1){
        if (num%contador == 0){
            resultado = false;
            break;
        }
        else{
            contador = contador - 1;
        }
    }

    return resultado;
  }
}




