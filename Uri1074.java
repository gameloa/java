import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int quantidade;
        
        quantidade = teclado.nextInt();

        for (int contador = 1; contador <= quantidade; contador++){

            numero = teclado.nextInt();

            if (numero == 0){
                System.out.println("NULL");
            }
            else if (numero % 2 == 0 && numero > 0){
                System.out.println("EVEN POSITIVE");
            }
            else if (numero % 2 == 0 && numero < 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if (numero % 2 != 0 && numero > 0){
                System.out.println("ODD POSITIVE");
            }
            else {
                System.out.println("ODD NEGATIVE");
            }

        }
        
    }
}