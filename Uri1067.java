import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        
        numero = teclado.nextInt();
        
        for (int contador = 1; contador <= numero; contador++){

            if (contador % 2 != 0) {

               System.out.println(contador);

            }
            
        }

        
        }
}