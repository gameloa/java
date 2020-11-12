import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int horainicio,mininicio, horafim, minfim;
        int duracao=0;
        int horaresultado, minutoresultado;
                
        horainicio = teclado.nextInt();
        mininicio = teclado.nextInt();
        horafim = teclado.nextInt();
        minfim = teclado.nextInt();

        duracao = (horafim *60 + minfim) - (horainicio*60 + mininicio);
    
        if ( duracao <= 0){
            duracao = duracao + 24 * 60;
        }

        horaresultado = duracao / 60;
        minutoresultado = duracao % 60;

        System.out.println("O JOGO DUROU " + horaresultado + " HORA(S) E " + minutoresultado + " MINUTO(S)");

        }
}