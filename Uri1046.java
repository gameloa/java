import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int iniciojogo,fimjogo;
        int duracao=0;
                
        iniciojogo = teclado.nextInt();
        fimjogo = teclado.nextInt();

        duracao = fimjogo - iniciojogo;
    
        if ( duracao <= 0){
            duracao = duracao + 24;
            }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        }
}