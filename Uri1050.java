import java.util.Scanner;

public class Uri1050{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        /*  61 Brasilia
            71 Salvador
            11 Sao Paulo
            21 Rio de Janeiro
            32 Juiz de Fora
            19 Campinas
            27 Vitoria
            31 Belo Horizonte
            DDD nao cadastrado*/


        int codigoDDD;
        
        codigoDDD = teclado.nextInt();
                
        if (codigoDDD == 61){
            System.out.println("Brasilia");
        }

        else if (codigoDDD == 71){
            System.out.println("Salvador");
        }

        else if (codigoDDD == 11){
            System.out.println("Sao Paulo");
        }

        else if (codigoDDD == 21){
            System.out.println("Rio de Janeiro");
        }

        else if (codigoDDD == 32){
            System.out.println("Juiz de Fora");
        }

        else if (codigoDDD == 19){
            System.out.println("Campinas");
        }

         else if (codigoDDD == 27){
            System.out.println("Vitoria");
        }

        else if (codigoDDD == 31){
            System.out.println("Belo Horizonte");
        }

        else {
            System.out.println("DDD nao cadastrado");
        }
         
        }
}