import java.util.Scanner;

public class DecToPort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String [] cMilhar = { "", "cem", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "novecentos"};
        String [] cente = { "", "" , "vinte", "trinta", "quarenta","cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String [] casaDez = { "dez", "onze", "doze", "treze","quatorze", "quinze", "dezeseis", "dezesete", "dezoito", "dezenove"};
        String [] uni = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        while(scan.hasNext()){
            numero = scan.nextInt();
            
            if (numero > 99999){
                centenas_milhar = numero/100000;
                numero = numero % 100000;
                dezenas_milhar = numero/10000;
                numero = numero % 10000;
                milhares = numero/1000;
                numero = numero % 1000;
                centenas = numero/100;
                numero = numero % 100;
                dezenas = numero/10;
                numero = numero % 10;
                unidades = numero;
                
                if (dezenas_milhar != 0)
                    str = cMilhar[centenas_milhar] + " e ";
                    
                    if (dezenas_milhar == 1){
                        adicionar = casaDez[milhares]
                        str = str + adicionar;
                    }
                    
                    else if (dezenas_milhar != 1){
                        str = str + cente[dezenas_milhar];
                    }
                    
                    if (milhares)
                
            }
            
            else if (numero  > 9999){
                dezenas_milhar = numero/10000;
                numero = numero % 10000;
                milhares = numero/1000;
                numero = numero % 1000;
                centenas = numero/100;
                numero = numero % 100;
                dezenas = numero/10;
                numero = numero % 10;
                unidades = numero;
            }
            
            else if (numero > 999){
                milhares = numero/1000;
                numero = numero % 1000
                centenas = numero/100;
                numero = numero % 100;
                dezenas = numero/10;
                numero = numero % 10;
                unidades = numero;
            }
            
            else if (numero > 99){
                centenas = numero/100;
                numero = numero % 100;
                dezenas = numero/10;
                numero = numero % 10;
                unidades = numero;
            }
            
            else if (numero > 9){
                dezenas = numero/10;
                numero = numero % 10;
                unidades = numero;
            }
            
            else if (numero < 10){
                unidades = numero;
            }
        }

        int indu, milhares = 0, centenas = 0, dezenas = 0, unidades = 0;
        String [] milhar = { "", "M", "MM", "MMM"};
        String [] cente = { "", "C", "CC", "CCC", "CD","D", "DC", "DCC", "DCCC", "CM"};
        String [] deze = { "", "X", "XX", "XXX", "XL","L", "LX", "LXX", "LXXX", "XC"};
        String [] uni = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

