import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        float numero;
        int qtdQuadrado=0;
        
        numero = teclado.nextFloat();

        for (int qtdPar = 2; qtdPar <= numero;){

            qtdQuadrado = qtdPar * qtdPar;

            System.out.println(qtdPar+ "^2 = " + qtdQuadrado);

            qtdPar = qtdPar + 2;

        }
        
    }
}