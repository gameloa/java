import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        float numero;
        int qtdPositivo=0;

        for (int contador = 1; contador <=5; contador++){

            numero = teclado.nextFloat();
            if (numero % 2 == 0) {
               qtdPositivo++;
            }
        }

        System.out.println(qtdPositivo+ " valores pares");

        }
}