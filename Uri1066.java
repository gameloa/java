import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        float numero;
        int qtdPar=0;
        int qtdImpar=0;
        int qtdPositivo=0;
        int qtdNegativo=0;

        for (int contador = 1; contador <=5; contador++){

            numero = teclado.nextFloat();

            if (numero % 2 == 0) {
               qtdPar++;
            }

            else if (numero % 2 != 0) {
                qtdImpar++;
            }
            

            if (numero > 0){
                qtdPositivo++;
                
            }

            else if (numero < 0){
                qtdNegativo++;
                }
        }

        System.out.println(qtdPar+ " valor(es) par(es)");
        System.out.println(qtdImpar+ " valor(es) impar(es)");
        System.out.println(qtdPositivo+ " valor(es) positivo(s)");
        System.out.println(qtdNegativo+ " valor(es) negativo(s)");

        }
}