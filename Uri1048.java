import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        /*0 - 400.00 ==> 15%
        400.01 - 800.00 ==> 12%
        801.00 - 1200.00 ==> 10%
        1200,01 - 2000.00 ==> 7%
        Acima de 2000.00 ==> 4%

        Imprima 3 linhas na saída: 
        o novo salário, 
        o valor ganho de reajuste e 
        o percentual de reajuste ganho
        
        Novo salario: 460.00
        Reajuste ganho: 60.00
        Em percentual: 15 %*/


        double salarioatual;
        double salarionovo;
        double reajuste;
        
        salarioatual = teclado.nextDouble();
                
        if (salarioatual <= 400.00 && salarioatual >=0){
            salarionovo = salarioatual * 1.15;
            reajuste = salarioatual * 0.15;
            System.out.printf("Novo salario: %.2f\n", salarionovo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        }

        else if (salarioatual > 400.00 && salarioatual <= 800.00){
            salarionovo = salarioatual * 1.12;
            reajuste = salarioatual * 0.12;
            System.out.printf("Novo salario: %.2f\n", salarionovo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %");
        }
                
        else if (salarioatual > 800.00 && salarioatual <= 1200.00){
            salarionovo = salarioatual * 1.00;
            reajuste = salarioatual * 0.10;
            System.out.printf("Novo salario: %.2f\n", salarionovo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %");
        }

        else if (salarioatual > 1200.00 && salarioatual <= 2000.00){
            salarionovo = salarioatual * 1.07;
            reajuste = salarioatual * 0.07;
            System.out.printf("Novo salario: %.2f\n", salarionovo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %");
        }

        else if (salarioatual > 2000.00){
            salarionovo = salarioatual * 1.04;
            reajuste = salarioatual * 0.04;
            System.out.printf("Novo salario: %.2f\n", salarionovo);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %");
        }

        }
}