import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        float numero;
        float somatoria=0;
        float media;
        int qtdPositivo=0;

        for (int contador = 1; contador <=6; contador++){

            numero = teclado.nextFloat();

            if (numero > 0) {
                qtdPositivo++;
                somatoria = somatoria + numero;
            }
        }

        media = somatoria / qtdPositivo;

        System.out.println(qtdPositivo + " valores positivos");
        System.out.printf("%.1f\n", media);

    }
}