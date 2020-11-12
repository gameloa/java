import java.util.Scanner;

public class Uri1037{
    public static void main(String args[]){
        
        /* 0 - 25
           25 - 50
           50 - 75
           75 - 100
           
           Intervalo (25,50]
           Intervalo [0,25]
           Intervalo (75,100]
           Fora de intervalo
        */

        Scanner teclado = new Scanner(System.in);
        
        float nro;
                
        nro = teclado.nextFloat();
                
        if (nro >= 0 && nro <= 25.00){
            System.out.println("Intervalo [0,25]");
        }

        else if (nro >= 25.00 && nro <= 50.00){
            System.out.println("Intervalo (25,50]");
        }
            
        else if (nro >= 50.00 && nro <= 75.00){
            System.out.println("Intervalo (50,75]");
        }

        else if (nro >= 75.00 && nro <= 100.00){
            System.out.println("Intervalo (75,100]");
        }

        else{
            System.out.println("Fora de intervalo");
        }

        }
}