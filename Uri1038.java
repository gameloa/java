import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        int codigo, qtd;
        double vartotal = 0;

        codigo = teclado.nextInt();
        qtd = teclado.nextInt();
        
        if (codigo == 1){
            vartotal = qtd * 4.00;

                }
        else if (codigo == 2){
            vartotal = qtd *4.5;
        }

        else if (codigo == 3){
            vartotal = qtd * 5.00;
        }
                
        else if (codigo == 4){
            vartotal = qtd * 2.0;
        }

        else if (codigo == 5){
            vartotal = qtd * 1.5;
        }

        System.out.printf("Total: R$ %.2f\n", vartotal);
         
        }
}