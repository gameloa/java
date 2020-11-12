import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int HORASPERC,VELOMEDIA;
        double TOTLITROS;
        
        HORASPERC = teclado.nextInt();
        VELOMEDIA = teclado.nextInt();
        
        TOTLITROS = HORASPERC*VELOMEDIA/12.0;

        System.out.printf("%.3f\n",TOTLITROS);

        }
}