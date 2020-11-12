import java.util.Scanner;

public class Uri1164{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int numlinha;
        int cadalinha=0;

        numlinha = teclado.nextInt();
            
        for (int contador = 1; contador <= numlinha; contador++){

                cadalinha = teclado.nextInt();
                int soma=0;

                for (int testanum = 1; testanum < cadalinha; testanum++){

                    if ( cadalinha % testanum == 0){

                        soma = soma + testanum;
                    
                    }

                }

            if (soma == cadalinha){

                System.out.println(cadalinha + " eh perfeito");

            }
            else{

                System.out.println(cadalinha + " nao eh perfeito");

            }               
        }      
    }
}