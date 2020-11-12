import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        float nro;
        int qtdPositivo=0;

        for (int contador = 1; contador <=6; contador++){

            nro = teclado.nextFloat();
            if (nro > 0) {
               qtdPositivo++;
            }
        }

        System.out.println(qtdPositivo+ " valores positivos");

        }
}