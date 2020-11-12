import java.util.Scanner;

public class Uri1143{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int numero = 1;
        int numlinha;

        numlinha = teclado.nextInt();
            
        for (int contador = 1; contador <= numlinha; contador++){


            System.out.println(numero + " " + (numero*numero) + " " +  (numero*numero*numero));
            numero = numero + 1;

        }   
    }
}