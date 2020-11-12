import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int combustivel;
        int alcool=0;
        int gasolina=0;
        int diesel=0;
                
        do{
            combustivel = teclado.nextInt();
            
            if (combustivel == 1){
                alcool++;
            }
            else if ( combustivel == 2){
                gasolina++;
            }
            else if ( combustivel == 3){
                diesel++;
            }
        } while (combustivel != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    
    }
}