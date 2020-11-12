import java.util.Scanner;

public class Uri2021{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        double Nro;
        double ced100,ced50,ced20,ced10,ced5,ced2,ced1;
        double moeda1, moeda50, moeda25, moeda10, moeda5, moeda01;
        double resto100, resto50, resto20, resto10, resto5, resto2;


        Nro = teclado.nextDouble();
        
        ced100 = Nro/100;
        resto100 = Nro % 100;
        
        ced50 = resto100 / 50;
        resto50 = resto100 % 50;

        ced20 = resto50 / 20;
        resto20 = resto50 % 20;

        ced10 = resto20 / 10;
        resto10 = resto20 % 10;
    
        ced5 = resto10 / 5;
        resto5 = resto10 % 5;

        ced2 = resto5 / 2;
        resto2 = resto5 % 2;
        
        ced1 = resto2 / 1;

        System.out.printf("Notas: %.2f\n",Nro);
        System.out.printf("nota(s) de R$ 100,00", ced100 );
        System.out.println("nota(s) de R$ 50,00" ced50);
        System.out.println("nota(s) de R$ 20,00" ced20);
        System.out.println("nota(s) de R$ 10,00" ced10);
        System.out.println("nota(s) de R$ 5,00" ced5);
        System.out.println("nota(s) de R$ 2,00" ced2 );
        System.out.println("nota(s) de R$ 1,00" ced1);
        }
}