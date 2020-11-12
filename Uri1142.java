import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int numero = 1;
        int numlinha;

        numlinha = teclado.nextInt();
            
        for (int contador = 1; contador <= numlinha; contador++){

            System.out.println(numero + " " + (numero+1) + " " +  (numero+2) + " PUM");
            numero = numero + 4;

        }   
    }
}